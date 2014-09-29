/*
    program: From 3 to 9669
    Malcolm Speed
    Sept. 29, 2014
    Debian Linux/ Java SDK

    Description:
	calculates the sum of a series of multiples of 3

    Difficulties:
	none

    what I learned:
	nothing new
*/

public class prog152a {

	public static void main(String[] args) {

		// one variable for counting and one for holding the sum
		int n = 3;
		long sum = 0;
		// one line loop 
		while (n <= 9669) { sum += n; n += 3; }
		//output
		System.out.println("The sum of the multiples of 3 to 9669 is " + sum);
	}	
}

/*
Sample Output:
The sum of the multiples of 3 to 9669 is 15586428
*/

