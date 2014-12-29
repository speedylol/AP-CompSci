

import java.util.Scanner;
import java.io.*;

public class prog213e {

	static Scanner input = null;
	public static void main(String[] args) {

		int ppl = 0;
		int current;
		int distribution;

		System.out.println("Age Group\tDistribution\tPercentage");
		try {

			input = new Scanner(new File("213e.txt"));	
			do {
				current = input.nextInt();
				
				if() {

				}

			} while(input.hasNext() == true);
			

		} catch(FileNotFoundException e) { System.exit(0); }

	}
}
