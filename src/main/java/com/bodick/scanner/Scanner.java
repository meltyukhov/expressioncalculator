package com.bodick.scanner;

import com.bodick.lexemes.Finalize;
import com.bodick.lexemes.Lexeme;

import java.util.ArrayList;
import java.util.List;

public class Scanner {
    private List<Lexeme> lexemes;
    private NumberEvaluator numberEvaluator = new NumberEvaluator();
    private Evaluator operatorEvaluator = new OperatorEvaluator();
    private Evaluator bracketsEvaluator = new BracketsEvaluator();
    private Evaluator spaceEvaluator = new SpaceEvaluator();
    private Evaluator unknownCharEvaluator = new UnknownCharEvaluator();

    public List<Lexeme> scan(String str) {
        lexemes = new ArrayList<>();

        for(char ch : str.toCharArray()) {

            if(Character.isDigit(ch) || ch == '.') {
                numberEvaluator.evaluate(ch, this);
            }
            else {
                numberEvaluator.getNumber(this);
                switch (ch) {
                    case '+':
                    case '-':
                    case '*':
                    case '/':
                         operatorEvaluator.evaluate(ch, this);
                         break;
                    case '(':
                    case ')':
                        bracketsEvaluator.evaluate(ch, this);
                        break;
                    case ' ':
                        spaceEvaluator.evaluate(ch, this);
                        break;
                    default:
                        unknownCharEvaluator.evaluate(ch, this);
                }
            }
        }
        numberEvaluator.getNumber(this);
        lexemes.add(new Finalize());
        return lexemes;
    }

    public void addLexeme(Lexeme lexeme) {
        lexemes.add(lexeme);
    }
}
