import java.util.Scanner;
import java.io.*;

/*
	Heron's Formula
	Malcolm Speed
	Manjaro Linux / Java SDk

	Description:
		tests data using Heron's formula

	Difficulties:
		none

*/

public class prog206a {

	static Scanner input = null;
	public static void main(String[] args) {

		System.out.println("A\tB\tC\t\tAREA");

		triangle tri = new triangle();
		try {

			input = new Scanner(new File("prog206a.txt"));
			
			//variables we will pass into the function
			int a,b,c;
			for(int i = 1; i <= 8; i ++) {

				//grabbing three numbers at a time
				a = input.nextInt(); 
				b = input.nextInt();
				c = input.nextInt(); 
				
				//call the function that will give us output
				tri.heron(a,b,c);
				a = 0; b = 0; c = 0;
				
			}

		} catch(FileNotFoundException e) { System.exit(0); }
	}
}
