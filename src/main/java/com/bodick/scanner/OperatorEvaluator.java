package com.bodick.scanner;

import com.bodick.lexemes.Add;
import com.bodick.lexemes.Divide;
import com.bodick.lexemes.Multiply;
import com.bodick.lexemes.Subtract;

public class OperatorEvaluator implements Evaluator {
    @Override
    public void evaluate(char ch, Scanner scanner) {
        switch(ch) {
            case '+':
                scanner.addLexeme(new Add());
                break;
            case '-':
                scanner.addLexeme(new Subtract());
                break;
            case '*':
                scanner.addLexeme(new Multiply());
                break;
            case '/':
                scanner.addLexeme(new Divide());
                break;
        }
    }
}
