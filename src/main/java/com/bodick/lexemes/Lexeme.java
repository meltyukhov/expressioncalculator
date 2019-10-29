package com.bodick.lexemes;

import com.bodick.Visitor;

public interface Lexeme {
    void accept(Visitor v);
}
