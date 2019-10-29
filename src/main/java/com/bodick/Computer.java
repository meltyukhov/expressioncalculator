package com.bodick;

import com.bodick.lexemes.Lexeme;
import com.bodick.scanner.Scanner;

import java.util.List;

public class Computer {
    public double compute(String str) {
        Scanner scanner = new Scanner();
        List<Lexeme> lexemes =  scanner.scan(str);

        Sorter sorter = new Sorter();
        lexemes = sorter.sort(lexemes);

        Calculator calculator = new Calculator();
        return calculator.calculate(lexemes);
    }
}
