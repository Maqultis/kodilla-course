package com.kodilla.testing.calculator;

public class Calculator {
    private int a;
    private int b;
    private int addResult;
    private int subtractResult;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void add(int a, int b) {
        addResult = a + b;
    }
    public void subtract(int a, int b) {
        subtractResult = a - b;
    }

    public int getAddResult() {
        return addResult;
    }
    public int getSubtractResult() {
        return subtractResult;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
