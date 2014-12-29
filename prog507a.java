/*

	Thinking Inside The Box
	Malcolm Speed
	Dec. 1, 2014
	Manjaro Linux

	Description:
		Prints lines of text inside a box of astericks

	Difficulties:
		None

*/


import java.util.Scanner;

public class prog507a {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
			//prompt and input
			System.out.print("Enter a String: ");
			String text = input.nextLine();

			int lines = text.length() + 5; // variable for used in constructing the whitespace and etc.

			for(int x =0; x < lines; x++) System.out.print("*"); //print the top of the box

			System.out.println();

			//content inside the box
			for(int y = 0; y < 3; y++){
	
				System.out.print("*");
				
				//switch statement to give us our whitespace
				switch(y) {
					
					case 0:
					case 2:
						for(int z = 0; z < lines - 2; z++)
							System.out.print(" ");
						break;
				}

				if(y == 1)
					System.out.print(" " + text + "  "); //print out our text

				System.out.print("*\n");
			}
			
			for(int i = 0; i < lines; i++) System.out.print("*"); //print the bottom of the box

	}
}
