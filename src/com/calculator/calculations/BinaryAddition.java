package com.calculator.calculations;

import com.calculator.dto.BinaryValues;

public class BinaryAddition extends BinaryCalculation {

	/**
	 * Method to add two numbers.
	 * 
	 * @param BinaryValues an array that contains two parameters for operation
	 * @return double the sum of two numbers.
	 */
	@Override
	public double calculate(BinaryValues binaryValues) {
		// TODO Auto-generated method stub
		return binaryValues.getValue1() + binaryValues.getValue2();
	}

}
