package com.antonio.demo.endpoint.rest.controller.health;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private CalculatorController calculator;

    @BeforeEach
    public void setUp() {
        calculator = new CalculatorController();
    }

    @Test
    public void testAdd() {
        assertEquals(8.0, calculator.add(5, 3));
    }
    
    @Test
    public void testSubstract () {
        assertEquals(2.0, calculator.subtract(5, 3));
    }
    
    @Test
    public void testMultiply () {
        assertEquals(15, calculator.multiply(5, 3));
    }
    
    @Test
    public void testDivide () {
        assertEquals(2.5, calculator.divide(5, 2));
    }
    
    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
    }

}
