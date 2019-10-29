package com.bodick.lexemes;

import com.bodick.Visitor;

public class Number implements Lexeme {

    private double n;

    public Number(double n) {
        this.n = n;
    }

    @Override
    public void accept(Visitor v) {
        v.forNumber(this);
    }

    public double getN() {
        return n;
    }

    @Override
    public String toString() {
        return String.valueOf(n);
    }
}
