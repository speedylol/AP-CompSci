import java.io.*;
import java.util.Scanner;

public class prog213 {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {

		int morethan8 = 0;
		int count = 0;
		double pay = 0;
		int hours = 0;
		int hour = 0;

		try {

			input = new Scanner(new File("213.txt"));

			do {

				int num = input.nextInt();
				count++;

				hour = (num * 10);
				switch(count) {

					case 6:
						pay += ((hour) + (hour) * .125);
						hours += num;

						break;

					case 7:
						pay += ((hour) + (hour) * .5);
						hours += num;
						break;

					default:
						hours += num;			
						break;

				}
				
				System.out.print(num + " ");

				if (num > 8){
					pay += ((num - 8) * 1.50);
				}

				if(count == 7){

					if(hours > 40){
						pay += ((hour) + (num));		
					}

					pay += hours * 10;
					System.out.println("\n " + pay);
					count = 0;
				}
				
			} while(input.hasNext() == true);

		} catch(FileNotFoundException e) { System.exit(0); }
	}

}
