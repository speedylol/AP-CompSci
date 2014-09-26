/*
 * Program: Hourly Pay
 * Malcolm Speed
 * Sept. 25, 2014
 * 
 * Description:
 * 	Prints of list of hourly pays for 40 hours with a 4 dollar increment each time
 * 
 * What I learned:
 * 	nothing new
 * 
 * Difficulties:
 * 	none
 * 
 */


public class prog122b {

	public static void main(String[] args) {
		
		//Headers for the output
		System.out.println("Hours\tPay");
		//starting variable for the pay
		double pay = 4.00;
		//looping 40 times
		for(int i = 1; i <= 40; i++){

			//formatted output
			System.out.printf("%d\t%.2f\n", i, pay);
			//increment pay by 4 each loop
			pay += 4;
		}
		
	}
}
