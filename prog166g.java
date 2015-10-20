import java.util.Scanner;

public class prog166g {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int user, aa;
		
		do {
					
			System.out.print("Please enter the number of rows you would like to print: ");
			user = input.nextInt();
			
			for(int i = 1; i <= user; i++)
				System.out.print(i + "\t");
			
			aa = 1;
			
			System.out.println();
			for(int x = 1; x <= user; x++) {
				for(int y = 1; y < x + 1; y++) 
					System.out.print((x * y) + "\t");
				
				System.out.println();
			}
			
		} while(user != 0);
	}
}
