package com.bodick.lexemes;

import com.bodick.Visitor;

public class ClosingBracket implements Lexeme {
    @Override
    public void accept(Visitor v) {
        v.forClosingBracket(this);
    }
}
