package com.bodick.lexemes;

import com.bodick.Visitor;

public abstract class Operator implements Lexeme {
    @Override
    public void accept(Visitor v) {
        v.forOperator(this);
    }

    public abstract double operate(double a, double b);

    public abstract int priority();
}
