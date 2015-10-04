package compsciAP;

/*
 * Lower--Higher
 * Malcolm Speed
 * Nov. 8, 2014
 * Eclipse IDE
 * 
 * Description:
 * 	number guessing game
 * 
 * Difficulties:
 * 	none
 * 
 * What I Learned:
 * 	nothing new
 */

//importing random and scanner classes
import java.util.Random;
import java.util.Scanner;

public class prog210c {

	//setting object variables for scanner and random
	static Random rand = new Random();
	static Scanner input =  new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//main variables used in program
		int guesses = 0;
		int user;
		int num = rand.nextInt(100);
		
		//header output
		System.out.println("I am thinking of a number between 1 and 100");
		
		//do-while to keep guessing until you are right
		do {
			//prompt + input
			System.out.print("What do you think it is? ");
			user = input.nextInt();
			
			//increment after each guess
			guesses++;
			
			//if they are too high, lets them know
			if(user > num)
				System.out.println("Lower--Try Again");
			//if they are too low, lets them know
			else if(user < num)
				System.out.println("Higher--Try Again");
			//prompts when you are right and the while part
			//of the do-while will break the loop
			else if(user == num)
				System.out.printf("You got it right in %d guesses\n", guesses);
		}while(user != num);
		
	}
}
