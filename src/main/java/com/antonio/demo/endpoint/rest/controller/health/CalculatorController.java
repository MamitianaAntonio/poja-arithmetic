package com.antonio.demo.endpoint.rest.controller.health;

import com.antonio.demo.endpoint.rest.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
  private final CalculatorService arithService;

  public CalculatorController(CalculatorService arithService) {
    this.arithService = arithService;
  }

  @GetMapping("/add")
  public long add(@RequestParam long a, @RequestParam long b) {
    return arithService.arithAdd(a, b);
  }

  @GetMapping("/subtract")
  public double subtract(@RequestParam long a, @RequestParam long b) {
    return arithService.arithSubtract(a, b);
  }

  @GetMapping("/multiply")
  public double multiply(@RequestParam long a, @RequestParam long b) {
    return arithService.arithMultiply(a, b);
  }

  @GetMapping("/divide")
  public double divide(@RequestParam long a, @RequestParam long b) {
    if (b == 0) {
      throw new ArithmeticException("Division with zero is impossible");
    }
    return arithService.arithDivide(a, b);
  }
}
