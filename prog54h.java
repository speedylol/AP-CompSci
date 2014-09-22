/*
	Malcolm Speed
	AP CompSci
	Sept. 11, 2014
*/

public class prog54h {

	//creating global variables for all the value provided for me.
	static final double pi = 3.14159;
	static double diameter = 4.16;
	static double radius  = .95;

	public static void main(String[] args) {

		// find the area and assign to a variable
		double area = (pi * (radius * radius));
		// output
		System.out.print("Donut island with a diameter of 4.16 miles that contains a circular lake of ");
		System.out.print("9.5 miles has " + area + " square miles of cultivatable land");

	}
}
