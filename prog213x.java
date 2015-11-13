package compsciAP;

import java.util.Scanner;
public class prog213x {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Last Tag Number: ");
		String user = input.nextLine();
		
		if(user.length() == 6) {
			
			String letter1 = user.substring(0, 1);
			String letter2 = user.substring(1, 2);
			String letter3 = user.substring(2, 3);
			String allLetters = user.substring(0, 3);
			
			char let1 = letter1.charAt(0);
			char let2 = letter2.charAt(0);
			char let3 = letter3.charAt(0);
			
			int numbers = Integer.parseInt(user.substring(3));			
			
			if (numbers == 999) numbers = 0;
			
			if (allLetters.contains("Z")) {
				
				if(allLetters.substring(0, 1) == "Z") letter1 = "A";
				
				else if(allLetters.substring(1, 2) == "Z") {
					let2 = 'A';
					let1 = (char) (let1 + 1);
				}
				
				else if(allLetters.substring(2, 3) == "Z") {
					let3 = 'A';
					let2 = (char) (let2 + 1);
				}	
			}
			
			System.out.println(String.valueOf(let1) + String.valueOf(let2) + (String.valueOf(let3)));
			
		}
	}
}
