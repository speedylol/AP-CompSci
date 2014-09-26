/*
 * Program: Straight Line
 * Malcolm Speed 
 * AP CompSci
 * Sept. 25, 2014
 * 
 * Description:
 * 	Program to calculate deprecation of an object over a given amount 
 * 	of years. Takes input 
 * 
 * What I learned:
 * 	nothing new
 * 
 * Difficulties:
 * 	none
 */

import java.util.Scanner;

public class prog108b {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		for(int count = 0; count <= 4; count++) {
			
			System.out.print("Enter Price: ");
			double price = input.nextDouble();
			System.out.print("Enter Salvage Value: ");
			double salvage = input.nextDouble();
			System.out.print("Enter estimated life in years: ");
			int estimated = input.nextInt(); 

			double deprecated = ((price - salvage) / estimated);
			System.out.print("Annual Deprecation: " + deprecated + "\n\n");
				
		}
		
	}
	
}
