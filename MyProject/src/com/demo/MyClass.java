package com.demo;

/**
 * Equation Generator
Generate a properly formatted equation for a set of natural numbers between 1 and 100 that are divisible by 3 or 5, including the sum.
For example, using the bounds of 1 and 10, the answer would be the string “3+5+6+9=23”.
Be sure to write a unit test to ensure your program is correct.
 * @author priti
 *
 */
public class MyClass {
	
	public static void main(String[] args) {
		
			
		System.out.println(formattedEquationOfNaturalNumbers(1,10));
	}

	private static String formattedEquationOfNaturalNumbers(int lowerBounds, int upperBounds) {
		
		if(lowerBounds <= 0 || lowerBounds >= 100 || upperBounds <= 0 || upperBounds >=100) {
			return null;
		}
		
		int sumOfNumbers = 0;
		String myString = "";
		for(int i = lowerBounds; i < upperBounds; i++ ) {
						
			if(i % 3 == 0 || i % 5 == 0) {
			
				myString += i+ "+";
				sumOfNumbers +=  i;
					
				}
		}
		
		myString += "=" +sumOfNumbers;
		
		return myString;
	}
	
	

}
