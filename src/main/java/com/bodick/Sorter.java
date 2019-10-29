package com.bodick;

import com.bodick.lexemes.*;
import com.bodick.lexemes.Number;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Sorter implements Visitor {
    private List<Lexeme> output;
    private LinkedList<Operator> operators;

    List<Lexeme> sort(List<Lexeme> input) {
        output = new ArrayList<>();
        operators = new LinkedList<>();

        for(Lexeme lexeme : input) {
            lexeme.accept(this);
        }

        return output;
    }

    public void forNumber(Number number) {
        output.add(number);
    }

    public void forOperator(Operator operator) {
        if(!operators.isEmpty()) {
            while(!operators.isEmpty() && operators.peek().priority() >= operator.priority())
                output.add(operators.pop());
        }
        operators.push(operator);
    }

    public void forOpeningBracket(OpeningBracket bracket) {
        operators.push(bracket);
    }

    public void forClosingBracket(ClosingBracket bracket) {
        while(!operators.isEmpty()) {
            if(operators.peek().priority() == -1) {
                operators.pop();
                return;
            }
            output.add(operators.pop());
        }
        throw new MissingBracketException("Missing an opening bracket");
    }

    public void forFinalize(Finalize finalize) {
        while (!operators.isEmpty()) {
            if(operators.peek().priority() == -1)
                throw new MissingBracketException("Missing closing bracket");
            output.add(operators.pop());
        }
    }
}
