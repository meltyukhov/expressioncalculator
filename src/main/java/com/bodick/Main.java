package com.bodick;

public class Main {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Please add a math expression to args");
            System.exit(1);
        }

        Computer computer = new Computer();
        System.out.println(computer.compute(args[0]));
    }
}
