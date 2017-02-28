package com.calculator.calculations;

import com.calculator.dto.BinaryValues;

public class BinaryMultiplication extends BinaryCalculation {

	/**
	 * This method is used to multiply two numbers.
	 * 
	 * @param BinaryValues an array containing two parameters for operation
	 * @return double the multiplication of two numbers.
	 */
	@Override
	public double calculate(BinaryValues binaryValues) {
		// TODO Auto-generated method stub
		return binaryValues.getValue1() * binaryValues.getValue2();
	}

}
