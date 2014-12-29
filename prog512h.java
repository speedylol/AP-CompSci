/*

	Three Letter Words
	Malcolm Speed
	Dec. 8, 2014
	Manjaro Linux/ Java SDK

	Description:
		Prints a poem and gets statistics based on the 
		words in the poem

	Difficltuies:
		None
*/

import java.util.Scanner;
import java.io.*;

public class prog512h {
	
	static Scanner input = null;
	public static void main(String[] args) {

		int x = 0;
		int y = 0;
		double percent;

		try {
			
			input = new Scanner(new File("512h.txt"));

			do {
				
				String word = input.next(); //variable to test length of
											//current word
				x++; //variable for total amount of words

				if(word.length() == 3 ) y++;//gets amount of 3 letter words
		
			} while(input.hasNext() == true);

			// resetting the file for output
			input = new Scanner(new File("512h.txt"));
			while(input.hasNext()) System.out.println(input.nextLine());
	
			percent = ((y/x) * 100);
			
			//output
			System.out.println("\nTotal Words = " + x);
			System.out.println("Three Letter Words = " + y);
			System.out.println("Percentage of Occurence = " + percent + "%");
	
		} catch(FileNotFoundException e) { System.exit(0); }
		
	}
}

