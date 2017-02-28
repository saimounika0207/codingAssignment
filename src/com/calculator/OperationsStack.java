package com.calculator;

import java.util.Stack;

/**
 * The data structures represents a last-in-first-out (LIFO) stack of objects,
 * we will store the operands in this stack
 */

public class OperationsStack {

	private Stack<Double> values = new Stack<Double>();

	/**
	 * Pushes an item onto the top of this stack.
	 * 
	 * @param value
	 *            the item to be pushed onto this stack.
	 */
	public void push(Double value) {
		values.push(value);
	}

	/**
	 * Removes the operand at the top of stack
	 * 
	 * @return the operand at top of stack
	 */
	public double pop() {
		return values.pop();
	}

	/**
	 * Looks for object at top of stack and returns it
	 * 
	 * @return
	 */
	public Double peek() {
		if (values.size() == 0)
			return 0.0;
		return values.peek();
	}

	/**
	 * check if stack is empty
	 * 
	 * @return true if empty
	 */
	public boolean empty() {
		return values.empty();
	}
}
