package com.calculator.calculations;

import com.calculator.dto.BinaryValues;

public class BinaryDivision extends BinaryCalculation {

	/**
	 * Method to divide two numbers, throws exception if 
	 * Dividend is 0
	 * @param BinaryValues an array that contains two parameters for operation
	 * @return double the division of two numbers.
	 */
	@Override
	public double calculate(BinaryValues binaryValues) {
		// TODO Auto-generated method stub
		if (binaryValues.getValue2() == 0) {
			throw new IllegalArgumentException("Division by zero is not possible");
		} else {

			return binaryValues.getValue1() / binaryValues.getValue2();
		}
	}

}
