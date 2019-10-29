package com.bodick.lexemes;

import com.bodick.Visitor;

public class Finalize implements Lexeme {
    public void accept(Visitor v) {
        v.forFinalize(this);
    }
}
