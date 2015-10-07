/*
	Program: Sum and Average
	Malcolm Speed
	Oct. 20, 2014
	Manjaro Linux/ Java SDK

	Description:
		Gets input from a file and outputs it back 
		with the sum of all the content, the average of all
		content

	Difficulties:
		none
	
	What I learned:
		Nothing new
*/
//import the file.io library
import java.util.Scanner;
import java.io.*;

public class prog155t {

	//set our scanner to read our file to null
	static Scanner file = null;
	public static void main(String[] args) {

		// make try/catch statements for getting the file
		try {
			file = new Scanner(new File("ints.txt"));
		} catch (FileNotFoundException e) {
			System.exit(0);
		}
		
		//3 variables for our file
		int size = 0;
		int current = 0;
		int sum = 0;
		//loop thru the file contents
		while (file.hasNextInt() && (current = file.nextInt()) != 0){
	
			sum += current;
			size++;
			System.out.println(current);
		}
		//output
		System.out.print("The sum of all scores = " + sum);
		System.out.print("\nThe number of scores = " + size);
		System.out.print("\nThe of the numbers = " + ( ((double)sum/size)));
	}
}
