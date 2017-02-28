package com.calculator;

import java.util.Stack;

import com.calculator.calculations.BinaryAddition;
import com.calculator.calculations.BinaryDivision;
import com.calculator.calculations.BinaryMultiplication;
import com.calculator.calculations.BinarySubtraction;
import com.calculator.calculations.Calculation;
import com.calculator.util.Commons;

public class Calculator {



	/**
	 * This method converts the user entered infix expression to postfix
	 * expression Postfix notation is a notation for writing arithmetic
	 * expressions in which the operands appear before their operators and on
	 * precedence. This expression are easy to evaluate
	 * 
	 * @param arithmeticexpression
	 *            user input string
	 * @return the postfix expression
	 */

	public String convertToPostfix(String arithmeticExpression) {

		String postfix = "";
		// Initialize the stack
		Stack<String> stack = new Stack();
		//Remove spaces in the user input, we don't need spaces for our operations
		arithmeticExpression = arithmeticExpression.replaceAll("\\s", "");
		//Split the string into tokens
		String[] tokens = arithmeticExpression.split("");
		for (String string : tokens) {
			// If string is an operator (+-*/)
			if (Commons.isOperator(string)) {

				/* If string has higher or equal to the precedence of the top of
				* the stack, then push string
				* on to the stack*/
				if (!stack.isEmpty()
						&& Commons.getPrecedence(string) >= Commons
								.getPrecedence(stack.peek())) {
					stack.push(string);
				} else {
					/* If string is not higher precedence than top of the stack,
					* then pop the elements from top of stack until stack is
					* empty
					* from the stack and append to the output*/
					while (!stack.isEmpty()
							&& Commons.getPrecedence(string) < Commons
									.getPrecedence(stack.peek())) {
						postfix += stack.pop();
					}

					stack.push(string);
				}

			}
			// If string is  operand append it to output
			else {
				postfix += string;
			}
		}
		//pop all the elements in stack and append to output
		while (!stack.isEmpty()) {
			postfix += stack.pop();
		}
		
		//return the postfix expression
		return postfix;

	}
	

	/**
	 * Evaluate the postfix expression
	 * @param str
	 * @return the output of arithmetic expression
	 */
	public double evaluate(String str) {
		//Split the string into tokens

		String[] tokens = str.split("");
		OperationsStack stack = new OperationsStack();

		for (String string : tokens) {
			// If string is an operand

			if (!Commons.isOperator(string)) {
				//push the element to stack
				stack.push(Double.parseDouble(string));
				continue;
			}

			doOperation(string, stack);
		}

		return stack.pop();
	}

	/**
	 * This method takes the type of calculation(+-/*) that need to be performed
	 * and pushes the result to stack
	 * @param operator (+-/*)  
	 * @param operationsStack contains the operands on which calculation has to be performed
	 */
	public void doOperation(String operator, OperationsStack operationsStack) {

		Calculation calculation = null;

		char op = operator.charAt(0);

		switch (op) {
		case '+':
			calculation = new BinaryAddition();
			break;
		case '-':
			calculation = new BinarySubtraction();
			break;

		case '*':
			calculation = new BinaryMultiplication();
			break;

		case '/':
			calculation = new BinaryDivision();
			break;

		}
		calculation.execute(operationsStack);
	}
	public double start(String arithmeticExpression) {

		String postfix = convertToPostfix(arithmeticExpression);
		return evaluate(postfix);
	}


}
