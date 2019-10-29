package com.bodick.scanner;

import com.bodick.lexemes.Number;

public class NumberEvaluator implements Evaluator {
    StringBuilder number = new StringBuilder();

    @Override
    public void evaluate(char ch, Scanner scanner) {
        number.append(ch);
    }

    public void getNumber(Scanner scanner) {
        if (number.length() > 0)
            scanner.addLexeme(new Number(Double.parseDouble(number.toString())));
        number = new StringBuilder();
    }
}
