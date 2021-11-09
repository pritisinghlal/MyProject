package com.test;

public class TestClass {
	
 static String formattedEquationOfNaturalNumbers(int lowerBounds, int upperBounds) {
		
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
		
		
		myString += " : " +sumOfNumbers;
		
		return myString;
	}
	

}
