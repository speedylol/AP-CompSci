
import java.io.*;
import java.util.Scanner;

public class prog213t {

	static Scanner input = null;
	public static void main(String[] args) {

		int count;

		System.out.println("LENGTH\tWIDTH\tDEPTH\tWEIGHT");
		try {

			input = new Scanner(new File("213t.txt"));
/*
			do {
				
				double length = input.nextDouble();
				double width = input.nextDouble();
				double depth = input.nextDouble();
				double weight = input.nextDouble();

				System.out.println(input.nextDouble());

			} while(input.hasNext() == true);
			*/
		} catch(FileNotFoundException e) { System.exit(0); }

		System.out.println(input.next());

	}
}


