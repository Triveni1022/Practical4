package com.example.calculatorapp;

import com.example.calculator.Calculator;

public class MainApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(5, 10);
        calculator.display();
    }
}