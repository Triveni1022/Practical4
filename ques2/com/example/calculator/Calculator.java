package com.example.calculator;

public class Calculator {
    // private member variable - only accessible within this class
    private int result;

    // default (package-private) member variable - accessible within same package
    int lastOperation;

    // public constructor - accessible from anywhere
    public Calculator() {
        this.result = 0;
        this.lastOperation = 0;
    }

    // public method - accessible from anywhere
    public void add(int a, int b) {
        result = a + b;
        updateLastOperation(1); // calling private method
    }

    // default (package-private) method - only accessible within same package
    void clearResult() {
        result = 0;
        lastOperation = 0;
    }

    // private method - only accessible within this class
    private void updateLastOperation(int operationType) {
        this.lastOperation = operationType;
    }

    // public method - accessible from anywhere
    public void display() {
        System.out.println("The result is: " + result);
    }
}