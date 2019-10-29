package com.bodick.lexemes;

public class Divide extends Operator {
    @Override
    public double operate(double a, double b) {
        return a / b;
    }

    @Override
    public int priority() {
        return 1;
    }

    @Override
    public String toString() {
        return "/";
    }
}
