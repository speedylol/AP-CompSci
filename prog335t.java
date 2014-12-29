/*

	Prime Sandwich
	Malcolm Speed
	12/18/2014
	Manjaro Linux/ Java SDK

	Description:
		given a number, returns the next number prime numbers that are 
		higher and lower 

	Difficulties:
		None


*/

import java.util.Scanner;

public class prog335t {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {

		// prompt and input
		System.out.print("Enter an integer greater than or equal to 2: ");
		int N = input.nextInt();

		prime(N);	//calling out function

	}

	// function for finding the prime numbers
	public static void prime(int n) {

		int x = n;
		int y = n;

		//go lower until finding a prime number
		do {
	
			x--;

		} while( ((x * 5) % 10) == 0);

		//go higher until finding a prime number
		do {

			y++;

			

		} while( ((y * 5) % 10) == 0);
		
		//output
		System.out.print("N is between " + x + " and " + y);

	}


}
