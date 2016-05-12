package com.aouohosolution.calculatortest;

/**
 * Created by UEFI on 11/05/2559.
 */
public class MainController {

    Calculator calculator = new Calculator();
    CalculatorListener listener;

    public CalculatorListener getListener() {
        return listener;
    }

    public void setListener(CalculatorListener listener) {
        this.listener = listener;
    }

    public void add(double firstOperand, double secondOperand) {
        listener.onSuccess(calculator.addplus(firstOperand, secondOperand));
    }

    public void minus(double firstOperand, double secondOperand) {
        listener.onSuccess(calculator.subtrack(firstOperand, secondOperand));
    }

    public void multiply(double firstOperand, double secondOperand) {
        listener.onSuccess(calculator.multiply(firstOperand, secondOperand));
    }

    public void divide(double firstOperand, double secondOperand) {
        listener.onSuccess(calculator.divide(firstOperand, secondOperand));
    }
}
