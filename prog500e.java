
/*

	dot leader
	Malcolm Speed
	Nov. 25, 2014
	Manjaro Linux/ Java SDK

	Description:
		Make your own table of contents

	Difficulties:
		None

*/

import java.util.Scanner;

public class prog500e {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {

		//prompt for title
		System.out.print("Enter the title: ");
		String title = input.nextLine();

		//prompt for page number
		System.out.print("Enter the page number: ");
		int page = input.nextInt();
		
		//first part of output
		System.out.print("\n" + title);
		for(int dot = 0; dot <= (50 - title.length()); dot++) //keep within 50 character limit
			System.out.print("."); //print our dot
		
		System.out.print(page);//print page number
	}
}
