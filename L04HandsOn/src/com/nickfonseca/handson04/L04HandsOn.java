package com.nickfonseca.handson04;

public class L04HandsOn {

	public static void main(String[] args) {
		// -----STEP 1------
		int val = 5;
		System.out.println("Value: " + val);
		System.out.println("Doubled: " + doubleMe(val));
		// -----STEP 2------		
		System.out.println("Value: " + val);
		System.out.println("Quadrupled: " + quadrupleMe(val));
		// -----STEP 3-----
		int s3 = 3;
		int count = 2;
		System.out.println("Value: " + s3);
		int s3Times = 3;
		System.out.println("Times: " + s3Times);
		int result3 = doubleMeTimes(s3, s3Times);
		System.out.println("Result: " + result3);
		
	}
	//STEP 1
	//create a method named doubleMe that:

	//- Has one integer parameter val (you can name the parameter however you'd like)

	//- Doubles the value of val and returns the result
	public static int doubleMe(int val) {
		
		return val * 2;		
		
	}
	/* Step 2
	 * Create a method named quadrupleMe that:

		Has one integer parameter val (you can name the parameter however you'd like)

		Uses the doubleMe method (from Step 1) to double the value of 
		val — twice (i.e., quadrupled). The method should return the result.
	 */
	public static int quadrupleMe(int val) {
		
		
		return doubleMe(doubleMe(val));
	}
	/*	STEP 3
	 * 	- Create a method named doubleMeTimes that:
 		Has two integer parameters:

		- val This first parameter is the value that should be doubled. 
		You should use the doubleMe method from Step 1. The number of 
		times to double the value is determined by the second parameter.

		- count  The value of this second parameter indicates the number 
		of times val should be doubled.

		- Returns the result of doubling val a total of count times.

		- Print out the value of the input and output, before and after 
		calling the doubleMeTimes method.
	 */
	public static int doubleMeTimes(int val, int count) {
		int total = val;
		for(int i = 0; i < count; i++) {
			total = doubleMe(total);
			
		}
		
		return doubleMe(val) * count;
	}
		
}
