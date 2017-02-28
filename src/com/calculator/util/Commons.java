package com.calculator.util;

public class Commons {

	/**
	 * Method used to decide whether the 
	 * character is an operator(+-*\/) or operand
	 * @param value  - character 
	 * @return true if operator, else false
	 */
	public static boolean isOperator(String value) {

		if (value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/")) {
			return true;
		}
		return false;
	}

	/**
	 * This method is used to decide whether operator has higher precedence or lower precedence
	 * higher the value it returns higher the precedence the operator has
	 * @param value - character
	 */
	public static int getPrecedence(String value) {
		char ch = value.charAt(0);
		switch (ch) {
		case '+':
		case '-':
			return 1;

		case '*':
		case '/':
			return 2;

		}
		return -1;
	}
}
