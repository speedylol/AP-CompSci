/*
 * 
 * Malcolm Speed
 * Sept. 19, 2014
 * Eclipse IDE
 * 
 * Description:
 * 	Calculates how much someone will pay for electric bill based on 
 * 	how many kilowatts they used. Also calculates the late fee.
 * 
 * Difficulties:
 * 	None
 * 
 * What I learned: 
 * 	nothing new
 */

import java.util.Scanner;

public class prog93a {
	
	// Scanner variable and electricity percent constant declared
	static Scanner input = new Scanner(System.in);
	final static double elec = .0475; 
	
	public static void main(String[] args) {
		
		int $3a = 03;
		byte b = 6;
		long c = 69;
		double d = 7;
		
		double answer = (double) (13 / 5);
		
		
		 //getting keyboard input
		System.out.print("Enter KWH used: ");
		int kws = input.nextInt();
		double basecharge = kws * elec;
		
		// 2 more constants for the percents
		final double surcharge = (basecharge * .10); 
		final double citytax = (basecharge * .03);
		
		//lots o' output
		System.out.println("\n  C O M P S C I Electric");
		System.out.println("------------------------------");
		System.out.printf("Kilowatts used   %d @ 0.0475\n", kws);
		System.out.println("------------------------------");
		System.out.printf("\nBase Charge\t$%.2f", basecharge);
		System.out.printf("\nSurcharge\t$%.2f", surcharge);
		System.out.printf("\nCitytax\t\t$%.2f", citytax);
		System.out.println("\n  \t        _______");
		
		//last constant and last bit of output 
		final double latefee = ((basecharge + surcharge + citytax) + (.04 * basecharge));
		System.out.printf("\npay this amount\t$%.2f", (basecharge + surcharge + citytax));
		System.out.printf("\nAfter May 20th Pay   $%.2f", latefee); 
	}
}
