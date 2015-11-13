package compsciAP;

/* Charting Sales
 * Malcolm Speed
 * 1/10/15
 * 
 * Description:
 * 	Displays graph of data
 * 
 *  PS:	I made monday the first day of the week
 * 		instead of Sunday like in the example
 * 
 * Difficulties:
 * 	None
 */


import java.util.Random;

public class prog310t {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Day\tDaily\tSales Graph");
		for(int i = 1; i <= 31; i++) {
			int random = randomnum(10000, 40000);
			if((i % 7) != 0) { //keeps the weeks within 6 days
				//output
				System.out.print(i + "\t");
				System.out.print(random + "\t");
				result(random);
			
				System.out.println();
			
			}
			
			if((i % 7) == 0) //when a week has passes start a new week
				System.out.println();
		}
	}

	/**
	 * Prints histogram
	 * @param amount - Counter for how many times we print asterisk
	 */
	public static void result(double amount) {
		for(int i = 0;i <= (amount / 1000); i++) 
			System.out.print("*");		
	}
	
	/**
	 * Generate random number between 10000 and 40000
	 * @param min
	 * @param max
	 * @return num
	 */
	public static int randomnum(int min, int max) {
		Random rand = new Random();	
		int num = rand.nextInt((max - min) + 1) + min;
		return num;
	}
}
