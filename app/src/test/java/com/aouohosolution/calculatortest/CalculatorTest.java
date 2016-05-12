package com.aouohosolution.calculatortest;

import com.aouohosolution.calculatortest.exception.DivideByZeroException;

import org.junit.Test;

import static junit.framework.Assert.fail;
import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {
    //จำเป็นต้อง test ด้วย data ที่มากกว่า 1 ชุดด้วย

    //Arrange - preCondition for testing
    Calculator calculator = new Calculator();

    @Test
    public void testPlusOneOne() {
        //Act - acting
        //Assert
        assertEquals(2 , calculator.addplus(1, 1), 0);
    }

    @Test
    public void testPlusOneFour() {
        assertEquals(5.0 , calculator.addplus(1, 4));
    }

    @Test
    public void subtrack() {
        assertEquals(3.0 , calculator.subtrack(5, 2));
        assertEquals(0.0 , calculator.subtrack(1, 1));
    }

    @Test
    public void testMultiplyThreeFour() {
        assertEquals(12.0 , calculator.multiply(3, 4));
    }

    @Test
    public void testDivideThreeFour() {
        double actualResult = calculator.divide(3, 4);
        assertEquals(0.75 , actualResult);
    }

    @Test(expected = DivideByZeroException.class)
    public void testDivideTwoZero_DivideByZeroException() {
        calculator.divide(2, 0);
    }

    @Test
    public void testDivideTwoZero_DivideByZeroException2() {
        try {
            calculator.divide(2, 0);
            fail("มึงบ้า");
        } catch (DivideByZeroException e) {

        }
    }
}