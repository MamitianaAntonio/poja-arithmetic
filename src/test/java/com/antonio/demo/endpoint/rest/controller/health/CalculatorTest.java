package com.antonio.demo.endpoint.rest.controller.health;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.antonio.demo.endpoint.rest.service.CalculatorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
  private CalculatorController calculator;
  private CalculatorService arithService;

  @BeforeEach
  public void setUp() {
    arithService = new CalculatorService();
    calculator = new CalculatorController(arithService);
  }

  @Test
  public void testAdd() {
    var a = 5;
    var b = 3;

    var sum = arithService.arithAdd(a, b);
    assertEquals(8.0, sum);
  }

  @Test
  public void testSubstract() {
    var a = 5;
    var b = 3;

    var subtract = arithService.arithSubtract(a, b);
    assertEquals(2.0, subtract);
  }

  @Test
  public void testMultiply() {
    var a = 5;
    var b = 3;

    var multiply = arithService.arithMultiply(a, b);
    assertEquals(15, multiply);
  }

  @Test
  public void testDivide() {
    var a = 15;
    var b = 3;

    var divide = arithService.arithDivide(a, b);
    assertEquals(5, divide);
  }

  @Test
  void divide_byZero_shouldThrowException() {
    ArithmeticException ex =
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));

    assertEquals("Division with zero is impossible", ex.getMessage());
  }
}
