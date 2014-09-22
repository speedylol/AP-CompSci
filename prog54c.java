/*
	Malcolm Speed
	AP CompSci
	Sept. 11, 2014
*/

// import the scanner class
import java.util.Scanner;

public class prog54c {

	//declare global variable for pi so i can use it later
	static final double pi = 3.14159;
	//create a class variable to reference the scanner class for input
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
 
		// all the output (using the printf method so it can take formatted strings)
		System.out.print("The Radius of the circle = \t ");
		//getting input for the radius and assigning it to a variable called radis
		double radius = input.nextDouble();
		//using my seperate functions to get the circumference and area and output them
		System.out.printf("The Area of the Circle = \t %.3f\n",  area(radius));
		System.out.printf("The Circumference of the circle = \t %.3f\n", circum(radius));
	}

	// public method for finding circumference
	public static double circum(double r) {

		return (2 * pi * r);
	}
	//public method for finding the area of a circle
	public static double area(double r) {

		return (pi * (r * r));
	}
}
