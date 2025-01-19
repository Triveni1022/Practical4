package com.example.calculator;

public class Calculator {
    private int result;

    public Calculator() {
        this.result = 0;
    }

    public void add(int a, int b) {
        result = a + b;
    }

    public void display() {
        System.out.println("The result is: " + result);
    }
}
