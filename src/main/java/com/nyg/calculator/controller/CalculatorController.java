package com.nyg.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nyg.calculator.dto.CalculationRequest;
import com.nyg.calculator.dto.CalculationResponse;
import com.nyg.calculator.service.CalculatorService;

@RestController
@RequestMapping("calculator")
public class CalculatorController {

	CalculatorService calculatorService;

	public CalculatorController(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}

	@PostMapping("/calculate")
	public CalculationResponse cal(@RequestBody CalculationRequest request) {
		String result = calculatorService.calculate(request.getNum1(), request.getNum2(), request.getOperation());
		return new CalculationResponse(request.getNum1(), request.getNum2(), request.getOperation(), result);
	}

	@GetMapping("/add")
	public CalculationResponse add(@RequestParam double num1, @RequestParam double num2) {
		String result = calculatorService.add(num1, num2);
		return new CalculationResponse(num1, num2, "ADD", result);
	}

	@GetMapping("/subtract")
	public CalculationResponse subtract(@RequestParam double num1, @RequestParam double num2) {
		String result = calculatorService.subtract(num1, num2);
		return new CalculationResponse(num1, num2, "SUBTRACT", result);
	}

	@GetMapping("/multiply")
	public CalculationResponse mutiply(@RequestParam double num1, @RequestParam double num2) {
		String result = calculatorService.multiply(num1, num2);
		return new CalculationResponse(num1, num2, "MULTIPLY", result);
	}

	@GetMapping("/divide")
	public CalculationResponse divide(@RequestParam double num1, @RequestParam double num2) {
		String result = calculatorService.divide(num1, num2);
		return new CalculationResponse(num1, num2, "DIVIDE", result);
	}
}