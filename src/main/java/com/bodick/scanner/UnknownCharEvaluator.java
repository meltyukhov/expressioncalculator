package com.bodick.scanner;

public class UnknownCharEvaluator implements Evaluator {
    @Override
    public void evaluate(char ch, Scanner scanner) {
        throw new IllegalArgumentException("Unknown character: " + ch);
    }
}
