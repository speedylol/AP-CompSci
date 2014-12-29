/*
	Passing Trains
	Malcolm Speed
	Nov. 10, 2014
	Manjaro Linux

	Description:
		calculate when two trains pass

*/

import java.util.Scanner;

public class prog212a {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {

		// array to keep track of the time
		int[] time = { 9, 10, 11, 12, 1, 2};
		int passTrain = 0;
		int freightTrain = 40;
		int i = 0; int i2 = 0;

		System.out.print("Enter the speed of the passengers train ");
		int user = input.nextInt();			
		passTrain = user;

		do {
			i2++;
			i = i2;
			i = time[i];
	
			freightTrain += 40;
			System.out.println(passTrain + " " + freightTrain);
	
			if(i == 11)
				passTrain += user;
			
		} while (passTrain <= 160 && freightTrain <= 160);
		
		int i3 = i + 1;

		if(passTrain >= 120 && freightTrain >= 120) {
			if (passTrain > freightTrain) {
				System.out.printf("passed at %d and %d", i, i3);
				System.exit(0);
			}
			System.out.print(i);
		}

		
			
	}
}
