
import java.util.Scanner;

public class prog202t {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {

		int count = 0;
		System.out.print("First day of the month: ");
		int day = input.nextInt();
		System.out.print("Number of days in the month: ");
		int month = input.nextInt();
		
		System.out.print("Sunday  Monday  Tuesday  Wednesday  Thursday  Friday  Saturday\n");

		int cal = 1;
		int dayx = day;
		do {

			
			switch(dayx){

				case 1:
					break;

				case 2:
					System.out.print("\t");
					break;

				case 3:
					System.out.print(" ");

				case 4:
					System.out.print("\t\t  ");

				default:
					break;

			}

			
			if(cal == (7 - day ) + 2)
				System.out.println();
			System.out.print(cal + "        ");
		
			if(cal >= 10)
				System.out.print("     ");
			if(cal == 5 + 7)
				System.out.println();

			else if(cal == 12 + 7)
				System.out.println();

			else if(cal == 19 + 7)
				System.out.println();



			dayx = 0;
			cal++;
			//System.out.print(day + "\t");
			count++;
		} while(count < 31);

	}
}
