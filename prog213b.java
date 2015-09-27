package compsciAP;

/*
 * Quantity Ordering 
 * Malcolm Speed
 * Nov. 11, 2014
 * Eclipse IDE
 * 
 *Desription:
 * calculates price based on quantity
 * 
 *Difficulties:
 *	none
 *
 *What I learned:
 *	nothing new 
 */

import java.util.Scanner;

public class prog213b {

	static Scanner input = new Scanner(System.in);
	static double price;
	public static void main(String[] args){

		//prompt + input
		System.out.print("Enter Quantity: ");
		int quant = input.nextInt();
		
		//if ordered less that 99
		if(quant <= 99) 
			price = 5.95;
		
		//if ordered between 100 and 199
		else if(quant >= 100 && quant <= 199)
			price = 5.75;
		
		//if ordered between 200 and 299
		else if(quant >= 200 && quant <= 299)
			price = 5.40;
		
		//if anything higher
		else
			price = 5.15;
		
		//output
		System.out.println("Price = " + price);
		System.out.printf("Amount due = %.2f", (price * quant));
	}
	
	/*	Sample Output: 
	  	Enter Quantity: 475
		Price = 5.15
		Amount due = 2446.25
	 */
}
