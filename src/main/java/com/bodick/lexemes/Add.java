package com.bodick.lexemes;

public class Add extends Operator {
    @Override
    public double operate(double a, double b) {
        return a + b;
    }

    @Override
    public int priority() {
        return 0;
    }

    @Override
    public String toString() {
        return "+";
    }
}
