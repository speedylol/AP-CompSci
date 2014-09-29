*
    Program: Function Chart
    Malcolm Speed
    Sept. 29, 2014
    Debian Linux/ Java SDK
    
    Description:
	prints a chart of numbers that correrspond with multiples of 2

    Difficulties:
	none

    What I learned:
	nothing new

*/

public class prog122c {

	public static void main(String[] args) {
		// Variable that will start off the chart		
		int num2 = 2;
		
		//loop to give us 5 rows
		for(int count = 1; count <= 5; count++) {			
		
			//formatting the rows to give us correct numbers and then incrementing the num2 variable
			System.out.printf("%d\t%d\t%d\t%d\n\n", (num2), (num2 + 1), (num2 * 2), (num2 * num2));
			num2 += 2;		
		}
	}
}

/*
Sample output:

2	3	4	4

4	5	8	16

6	7	12	36

8	9	16	64	

10	11	20	100

*/
