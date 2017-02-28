package com.calculator;

import java.util.Scanner;

public class MainClass {

	/**
	 * Takes the input from user, calculates and prints the result
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Read input from user
		System.out.println("Enter expression : ");
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		
		//calculate the arithmetic expression and print result
		Calculator calculator = new Calculator();
		System.out.println("Result : "+calculator.start(line));
	}

}
