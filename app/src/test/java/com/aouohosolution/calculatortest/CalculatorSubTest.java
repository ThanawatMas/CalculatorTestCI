package com.aouohosolution.calculatortest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by UEFI on 11/05/2559.
 */
@RunWith(Parameterized.class)
public class CalculatorSubTest {

    private double firstOperand;
    private double secondOperand;
    private double expectedResult;

    @Test
    public void sub() {
        Calculator calculator = new Calculator();
        String message = String.format("%f - %f", firstOperand, secondOperand);
        assertEquals(message, expectedResult, calculator.subtrack(firstOperand, secondOperand));
    }

    public CalculatorSubTest(double firstOperand, double secondOperand, double expectedResult) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {4, 9, -5.0},
                {2, 7, -5.0},
                {1, 8, -7.0},
                {5, 8, -3.0},
                {0, 1, -1.0}
        });
    }


}
