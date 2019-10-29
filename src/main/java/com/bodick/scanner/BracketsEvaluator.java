package com.bodick.scanner;

import com.bodick.lexemes.ClosingBracket;
import com.bodick.lexemes.OpeningBracket;

public class BracketsEvaluator implements Evaluator {
    @Override
    public void evaluate(char ch, Scanner scanner) {
        switch(ch) {
            case '(':
                scanner.addLexeme(new OpeningBracket());
                break;
            case ')':
                scanner.addLexeme(new ClosingBracket());
                break;
        }
    }
}
