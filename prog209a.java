/*

	Counting Numbers
	Malcolm Speed
	Nov. 17, 2014
	Manjaro Linux/ Java SDK

	Description:
		Takes file input and reads each integer, checks some condtitions
		and prints out some stats about the file

	Difficulties:
		None

	What I learned:
		Nothing new
*/	

//import scanner and io classes
import java.io.*;
import java.util.Scanner;

public class prog209a {

	//setting the Scanner variable equal to null
	static Scanner input = null;
	public static void main(String[] args) {

		//3 variables we will use to count things
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;

		// try and catch so we can actually use the file
		try {

			//scanning the file
			input = new Scanner(new File("209.txt"));

			//do while loop for each time we count the integer in a file
			do {

				//if the next in the file is an integer below 500, add one to the first counter
				if(input.nextInt() < 500)
					count1++;				

				//if it is higher that 500, add one to the second counter
				if(input.nextInt() >= 500)
					count2++;

				//counter that will go up for each time we check for integers
				count3++;

			} while(input.hasNext() == true);

		} catch(FileNotFoundException e) { System.exit(0); } // if they cant find the file then exit program

		//output
		System.out.println("The amount of numbers less than 500 is " + count1);
		System.out.println("The amount of numbers greater than or equal to 500 is " + count2);
		System.out.println("The amount of numbers in this file: " + count3);
	}

}
