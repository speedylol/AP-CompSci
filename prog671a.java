/*

	Program 671a
	Malcolm Speed
	12/18/14
	Manjaro Linux/ Java SDK

	Description:
		Provides methods of converting time

	Difficulties:
		None

*/




import java.util.Scanner;

public class prog671a {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {

		// prompt
		System.out.println("Conversion Tasks:\n"); 
		System.out.println("  1. Hours->minutes\n  2. days->hours\n  3. minutes->hours\n  4. hours->days\n  5. elapsed time" );
		System.out.print("Enter a Number: ");
		int choice = input.nextInt();
		
		//choose which function will run based on what input was given
		switch(choice) {
	
			case 1:
				hours2mins(); break;

			case 2:
				days2hours(); break;

			case 3:
				mins2hours(); break;

			case 4:
				hours2days(); break;

			case 5:
				elapsed(); break;

			default:
				System.exit(0);

		}

	}

	//convert hours to minutes
	public static void hours2mins() {
		
		System.out.println("num of hours: ");
		int hour = input.nextInt();	
		System.out.println(hour + " hours == " + (hour * 60) + " minutes");
	}

	//convert days to hours
	public static void days2hours() {
		
		System.out.println("# of days: ");
		int days = input.nextInt();
		System.out.println(days + " days == " + (days * 24) + " hours");
	}

	//convert minutes to hours
	public static void mins2hours() {

		System.out.println("# of minutes: ");
		int mins = input.nextInt();
		System.out.println(mins + " minutes == " + (mins / 60) + " hours" );
	}

	// converts hours to days
	public static void hours2days() {

		System.out.println();
		int hour = input.nextInt();
		System.out.println(hour + " hours == " + (hour / 24) + " days");
	}

	// returns how much time has elapsed given a beginning and ending time
	public static void elapsed() {

		System.out.print("Enter the beginning hour: "); int hour1 = input.nextInt();
		System.out.print("Enter the beginning minutes: "); int min1 = input.nextInt();
		System.out.print("Enter the ending hour: "); int hour2 = input.nextInt();
		System.out.print("Enter the ending minutes: "); int min2 = input.nextInt();
		int hour3;
		int min3;

		if(hour1 > hour2) 
			 hour3 = hour1 - hour2;

		else 
			 hour3 = hour2 - hour1;  

		
		if(min1 > min2) 
			 min3 = min1 - min2;

		else
			 min3 = min2 - min1;


		System.out.println(hour3 + " hrs " + min3 + " mins");

	}

}
