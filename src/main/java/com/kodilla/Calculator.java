package com.kodilla;

public class Calculator {
    public void someMethod() {
        System.out.println ("It works!");
    }
public int add(int x, int y) {
        return x + y;
    }

    public int mnozenie( int a, int b) {
        return a * b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }


    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        calculator.someMethod();
        System.out.println ("X + Y = " + calculator.add(1,2));
        System.out.println ("A - B = " + calculator.subtraction(1,2));
    }
}