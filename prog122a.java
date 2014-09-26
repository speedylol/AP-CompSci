/*
    Program: square vs squared
    Malcolm Speed
    Sept. 26, 2014
    
    Description: 
	prints a list of squared numbers and the square roots of numbers
	up until the count of 40.

    Difficulties:
	none

    What I learned:
	nothing new

*/


public class prog122a {

	public static void main(String[] args) {

		// Header for the list
		System.out.println("Number\tSquare\tSquare Root");

		// start number that you have to put outside loop
		// or it will reset variable
		int num = 1;

		for (int count = 1; count <= 40; count++) {

			//values that can be constantly reset
			int numsqrd = num * num;
			double numsqrt = Math.sqrt(num);
			
			// printing out the numbers and incrementing the 'num' variable
			System.out.printf("%d\t%d\t%.4f\n", num, numsqrd, numsqrt);
			num++;
		}

	}
}
