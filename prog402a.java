import java.util.Scanner;
import java.io.*;

/*
	Scores and Differences
	Malcolm Speed
	2/19/2015
	Manjaro Linux/ Java SDK

	Description:
		create a table of information based on input 
		from a seperate file.

	Difficulties:
		None

*/

public class prog402a {

	static Scanner input = null;
	public static void main(String[] args) {

		try {

			input = new Scanner(new File("data.txt"));

		} catch(FileNotFoundException e) { System.exit(0); }

		//Arrays that hold input from other file
		int[] id = new int[20];
		int[] score = new int[20];
		double[] diff = new double[20];
		
		int id_ = 0;
		int score_ = 0;
		int diff_ = 0;

		//first loop to put everything in the right array
		for(int i = 0; i < id.length ; i++) {

			int x = input.nextInt();
			id[id_] = x;

			int y = input.nextInt();
			score[score_] = y;

			id_++;
			score_++;
		}

		int sum = 0;

		//assign the value for the sum of scores
		for(int i = 0; i < id.length; i++) 
			sum += score[i]; 

		double avg = ((double) sum / (id.length )); //assign the value for the average
		
		//first part of the output
		System.out.println("Sum = " + sum);
		System.out.printf("Average = %.2f\n", avg);
		System.out.println("Count = " + id.length);
		
		//assign the values of the difference array
		for(int i = 0; i < id.length  ; i++) 
			diff[i] = (score[i] - avg);

		System.out.println("Id\tScore\tDiff");
		
		int z = 0;

		//final output
		while(input.hasNext()) {

			System.out.print(id[z] + "\t");
			System.out.print(score[z] + "\t");
			System.out.printf("%.2f\n", diff[z]);
			
			z++;

			if(z == 20) System.exit(0);
		}
	}
}
