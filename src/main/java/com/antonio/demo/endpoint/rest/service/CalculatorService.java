package com.antonio.demo.endpoint.rest.service;

import com.antonio.demo.PojaGenerated;
import org.springframework.stereotype.Service;

@PojaGenerated
@Service
public class CalculatorService {
  public long arithAdd(long a, long b) {
    return a + b;
  }

  public long arithSubtract(long a, long b) {
    return a - b;
  }

  public long arithMultiply(long a, long b) {
    return a * b;
  }

  public long arithDivide(long a, long b) {
    return a / b;
  }
}
