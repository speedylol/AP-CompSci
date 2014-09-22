/*
	Malcolm Speed
	AP CompSci
	Sept. 10, 2014
	Goal: Write program to find number of votes cast for each candidate
*/


public class prog52h {

	public static void main(String[] args) 
	{
		//just using first letters of the names 
		// so m = mary, p = pete, p2 = paul, j = joan
		int m, p = 74, p2 = 23, j = 86;

		// first we add the amount of votes Mary has over the other students
		int sum = p + p2 + j;
		
		//Mary is going to be the division of (9485 + 183) by 4
		m = (9485 + sum) / 4;
		
		//now that we know the true value of Mary, we can find all the other 
		// students' votes
		p = m - 74;
		p2 = m - 23;
		j = m - 86;

		output(m, p, p2, j);

	}
	
	// A seperate method for the output
	public static void output(int w,int x,int y,int z)
	{
		System.out.println("Mary won the election which gives her "+w+" votes");
		System.out.println("Pete has 74 less than Mary giving him "+x+" votes");
		System.out.println("Paul has 23 less than Mary giving him "+y+" votes");		System.out.println("Joan has 86 less that Mary giving her "+z+" votes");
		System.out.println("Total:\t\t\t\t   9485 votes");

	}
}
