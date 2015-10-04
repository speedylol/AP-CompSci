import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

/*

	Seperate  Pos and Neg
	Malcolm Speed
	2/20/2015
	Manjaro Linux/ Java SDK

	Description:
		Seperates Positive numbers from negative numbers

	Difficulties:
		none

*/


public class prog404 {

		static Scanner input = null;
		static Scanner input2 = null;
		public static void main(String[] args) {

			try {

				input = new Scanner(new File("file.txt"));
				input = new Scanner(new File("file.txt"));

			} catch (FileNotFoundException e) { System.exit(0); }

			int pn = 0;
			int nn = 0;

			while(input.hasNext()){
				
				int y = input.nextInt();
				if(y > 0)
					pn++;
				else
					nn++;

			}

			int[] p = new int[pn];
			int[] n = new int[nn];
			int i = 0;

			while(input.hasNext()) {
				
				int x = input.nextInt();
				if(x > 0){
					p[i] = x;

				} else {
					n[i] = x;

				}
				i++;
			}


			System.out.println("Positive\tNegative");

			for(int y = 0; y < p.length; y++)
				System.out.println(p[y] + "\t\t" + n[y]);

		}
}
