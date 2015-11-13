package compsciAP;

/*
 * Weather Forecasting
 * Malcolm Speed
 * Nov. 12, 2014
 * Eclipse IDE
 * 
 * Description:
 * 	Gives information of the weather based on
 * 	chirps of a cricket
 * 
 * Difficulties:
 * 	none
 * 
 * What I learned:
 * 	nothing new
 * 
 */

import java.util.Scanner;
public class prog213d {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args){

		//prompt for the cricket chirps
		System.out.print("Enter Cricket Chirps/Min: ");
		int chirps = input.nextInt();
		
		//set up our temperature variables with the
		//formula given to us and the celcius formula
		//that you can look up. and a string for our condition
		int fahr = ((chirps + 40) / 4);
		double celc = ((fahr - 32) * ((double) 5/9));
		String cond;
		
		//setting value for cond in correspondence to
		//the temperature
		if(fahr >= 109)
			cond = "Dead Cricket";
		
		else if(fahr >= 81 && fahr <=108)
			cond = "Whew";
		
		else if(fahr >= 65 && fahr <= 80)
			cond = "Ah-hhh";
		
		else if(fahr >= 45 && fahr <= 64)
			cond = "Take a Jacket";
		
		else
			cond = "Bur-rrr";
		
		//output
		System.out.println("Fahrenheit = " + fahr);
		System.out.printf("Centigrade = %.1f\n", celc);
		System.out.println("Condition = " + cond);
	}
