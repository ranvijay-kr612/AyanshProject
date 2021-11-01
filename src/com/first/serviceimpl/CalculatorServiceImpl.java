package com.first.serviceimpl;

import com.first.service.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService{

	@Override
	public int calculate(int number1, int number2) {
		return number1 * number2;
	}

}
