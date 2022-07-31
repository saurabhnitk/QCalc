package com.crio.qcalc;

public class StandardCalculator {

    private int result;

    public int getResult() {
        return result;
    }

    public void setResult(int value) {
        this.result = value;
    }

    public void clearResult() {
        result = 0;
    }

    public void add(int num1, int num2) {
        result = num1 + num2;
    }

    public int subtract(int num1, int num2){
        return num1 - num2;
    }


    public int multiply(int num1, int num2){
        return num1 * num2;
    }


    public int divide(int num1, int num2) {
        return num1 / num2;
    }







}
