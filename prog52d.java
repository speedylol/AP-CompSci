/*
	Program: Batter Up
	Author: Malcolm Speed
	Sept. 12, 2012
	Compiler/Platform: Java SDK/ Manjaro Linux

	Desciption:
		This program finds the batting average for a batter 
		by getting input for: # of times at bat, # of hits,
		# of walks

	Difficulties:
		none

	What I learned:
		nothing new
*/

import java.util.Scanner;

public class prog52d {

	public static void main(String[] args) {

		//create scanner varianbles and variable for the input to be stored
		Scanner input = new Scanner(System.in);
		int bats, hits, walks;
		//prompting user to give values and storing those values in appropiate variables
		System.out.print("Enter number of Times at bat: ");
		bats = input.nextInt();
		System.out.print("\nEnter number of Hits: ");
		hits = input.nextInt();
		System.out.print("\nEnter number of Walks: ");
		walks = input.nextInt();

		//print average
		System.out.printf("Average: %.3f", average(bats,hits,walks));
	}

	//implemented the method for finding batting averages in a 
	// new function
	public static double  average(int a, int b, int c) {
		
		return ( (double) c - (b / a));

	}

}
