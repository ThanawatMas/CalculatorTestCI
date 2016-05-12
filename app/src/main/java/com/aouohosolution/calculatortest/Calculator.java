package com.aouohosolution.calculatortest;

import com.aouohosolution.calculatortest.exception.DivideByZeroException;

public class Calculator {
    public double addplus(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    public double subtrack(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }

    public double multiply(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }

    public double divide(double firstOperand, double secondOperand) {
        if(secondOperand == 0) {
            throw new DivideByZeroException();
        }
        return firstOperand / secondOperand;
    }
}
