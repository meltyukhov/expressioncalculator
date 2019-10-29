package com.bodick;

import com.bodick.lexemes.*;
import com.bodick.lexemes.Number;

import java.util.List;
import java.util.ListIterator;

public class Calculator implements Visitor {
    private ListIterator<Lexeme> iterator;

    public double calculate(List<Lexeme> lexemes) {
        this.iterator = lexemes.listIterator();

        while(iterator.hasNext()) {
            iterator.next().accept(this);
        }

        return Double.parseDouble(iterator.previous().toString());
    }
    @Override
    public void forNumber(Number number) {

    }

    @Override
    public void forOperator(Operator operator) {
        iterator.remove();
        double arg1 = Double.parseDouble(iterator.previous().toString());
        iterator.remove();
        double arg0 = Double.parseDouble(iterator.previous().toString());
        double res = operator.operate(arg0, arg1);

        iterator.set(new Number(res));
    }

    @Override
    public void forOpeningBracket(OpeningBracket bracket) {
    }

    @Override
    public void forClosingBracket(ClosingBracket bracket) {
    }

    @Override
    public void forFinalize(Finalize finalize) {
    }
}
