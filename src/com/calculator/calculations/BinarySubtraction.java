package com.calculator.calculations;

import com.calculator.dto.BinaryValues;

public class BinarySubtraction extends BinaryCalculation{

	/**
	 * This method is used to subtract two integers.
	 * 
	 * @param BinaryValues an array containing two parameters for operation
	 * @return double the subtraction of two numbers.
	 */
	@Override
	public double calculate(BinaryValues binaryValues) {
		// TODO Auto-generated method stub
		return binaryValues.getValue1()-binaryValues.getValue2();
	}



}
