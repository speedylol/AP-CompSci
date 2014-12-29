
import java.util.Scanner;
import java.io.*;

public class prog505 {

	static Scanner input = null;
	public static void main(String[] args) {

		try {

			input = new Scanner(new File("505.txt"));
			int[] win = new int[5];

			int avg;
			System.out.println("Name\tBooks  Points");
			do {

				String first = input.next();
				String last = input.next();
				int books = input.nextInt();
				int points = 0;

				for(int i = 1; i < books; i++)
				switch(books) {
	
					case 1:
					case 2:
					case 3:
						points += 10; break;

					case 4:
					case 5:
					case 6:
						points += 15; break;

					case 7:
						points += 95; break;

					default:
						points += 20; break;

				}

				win[].append(books);

				avg += points;

				System.out.println(last.toUpperCase() +" "+ first +" "+ books +" "+ points);

			} while(input.hasNext() == true);
		
			System.out.println("\n" + avg / 5);


		} catch(FileNotFoundException e) { System.exit(0); }


	}

}
