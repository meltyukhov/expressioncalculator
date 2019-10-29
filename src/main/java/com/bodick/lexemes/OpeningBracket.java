package com.bodick.lexemes;

import com.bodick.Visitor;

public class OpeningBracket extends Operator {
    @Override
    public void accept(Visitor v) {
        v.forOpeningBracket(this);
    }

    @Override
    public double operate(double a, double b) {
        return 0;
    }

    //priority -1 stands for an opening bracket
    @Override
    public int priority() {
        return -1;
    }
}
