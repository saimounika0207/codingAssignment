package com.calculator.calculations;

import com.calculator.OperationsStack;
import com.calculator.dto.BinaryValues;

/**
 * This classes cannot be instantiated, this has to be subclassed
 * This class  pops the values from stack and calls the 
 * user's calculate method.
 * 
 * 
 */

abstract public class BinaryCalculation implements Calculation {

   /**
    * Subclasses provide implementation for this method.
    * @param binaryValues
    * @return
    */

	public abstract double calculate(BinaryValues binaryValues);

	/**
	 * Pops the values from stack and calls the subclass logic
	 * 
	 */
	public void execute(OperationsStack stack) {
		Double value1 = stack.pop();
		
		Double value2 = stack.pop();
		BinaryValues binaryValues = new BinaryValues(value2, value1);
		stack.push(calculate(binaryValues));
	}
}
