package compsciAP;

/*
 * if then student classifier
 * Malcolm Speed
 * Nov. 11, 2014
 * Eclipse IDE
 *
 * Description:
 * 	Determine whether a student is a freshman, sophmore,
 * 	Junior, or Senior based on the amount of credits they have	
 * 
 * Difficulties:
 * 	None
 * 
 * What I Learned:
 * 	Nothing new
 */
import java.util.Scanner;

public class prog213c {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args){
		
		//two important variables
		String user;
		int grade;
		
		//loop will go on until the user tells us no
		while(true){
			//the student number is pointless as shown in 
			//the example so we just take keyboard input
			//but we aren't going to waste any memory storing it in a variable
			System.out.print("\nEnter Student number: ");
			input.nextInt();
			
			//prompts user for their credits and gets the input
			System.out.print("Enter credits: ");
			double creds = input.nextInt();
			
			//if they have under 30 creds, theyre freshman
			if(creds < 30)
				grade = 1;
			
			//if between 30 and 70 creds, theyre a sophmore
			else if(creds >= 30 && creds < 70 )
				grade = 2;
			
			//if bewteen 70 and 90 creds, theyre a junior
			else if(creds >= 70 && creds < 90)
				grade = 3;
			
			//anything higher and they are a senior
			else 
				grade = 4;
			
			//telling them their grade and asking if they wish to repeat
			System.out.println("Grade level code = " + grade);
			System.out.print("Do again?(y/n)  ");
			
			//get input
			user = input.next();
			
			//required switch statement to see if use wishes to continue
			switch(user){
			
			case "y":
				continue;
			case "n":
				System.exit(0);
				
			default:
				System.exit(0);
			}
		}
	}
}
