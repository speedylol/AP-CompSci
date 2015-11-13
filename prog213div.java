package compsciAP;

/*
 * words per minute
 * Malcolm Speed
 * Eclipse IDE
 * 
 * Desription:
 * 	calculates words typed per minute
 * 
 * Difficulties:
 * 	none
 */

import java.util.Scanner;
public class prog213div {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		//prompting and getting input 
		System.out.println("Typing Speed Calculator");
		System.out.print("Enter the number of characters: ");
		int chr = input.nextInt();
		
		System.out.print("Enter the number of minutes: ");
		int mins = input.nextInt();
		
		System.out.print("Enter the number of errors: ");
		int err = input.nextInt();
		
		//output
		System.out.println(typeSpeed(chr, mins, err));
	}
	
	//seperate method for actually calculating  
	public static String typeSpeed(int character, int minutes, int errors) {
		
		//variables to hold all the caculations
		int words = character / 5;
		int calc = words / minutes;
		int net_words = (errors * 5) - calc;
		
		//testing conditions for our output
		if(net_words >= 30)  return "A - Great Job";
		else if (net_words >= 27 || net_words <= 29) return "B - Not Bad, You're almost at the top!";
		else if (net_words >= 24 || net_words <= 26) return "C - Keep practicing to improve";
		else if (net_words >= 21 || net_words <= 23) return "D - Keep your eyes on the copy and practice";
		else return "F - You're capable of better, concentrate!";	
	}
}
