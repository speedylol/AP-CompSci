/*
	Program: roots
	Author: Malcolm Speed
	Sept. 11, 2014
	Java SDK/ Manjaro Linux (Kernel 3.10.53)
	
	Desciption:
		Program that takes three values for input and uses
		the quadratic formula to find the roots.

	What I learned:
		nothing new

	Difficulties:
		none
*/
import java.util.Scanner;

public class prog58b {

	// declare/initialize scanner variable
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Quadratic Equation Solver\n Enter A, B, C: ");
		// 3 variables for input. all can be assigned on one line
		int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
		System.out.print("The roots are: ");
		quadFormula(a, b, c);
	}

	//method for calculating the roots implememnting the quadratic formula
	public static void quadFormula(int x, int y,int z) {
		
		double	squared = y * y - (4 * x * z);
		double root1 = ((-y + Math.sqrt(squared)) / (2 * x));
		double root2 = ((-y - Math.sqrt(squared)) / (2 * x));
		
		System.out.printf("%.1f %.1f", root1, root2);
	}
}


