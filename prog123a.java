package compsciAP;
/*
 * Program:  Counting 25 formatted numbers
 * Malcolm Speed
 * Oct. 12, 2014
 * Eclipse IDE
 * 
 * Description:
 * 	prints table of numbers from 1 to 25
 * 
 * Difficulties:
 * 	None
 * 
 * What I learned:
 * 	Nothing new
 */
public class prog123a {

	public static void main(String[] args) {
		
		//loop thru numbers  1 to 25
		for(int a = 1; a <= 25; a++){
			// output
			System.out.printf("%d\t", a);
			//if a is a multiple then we want to move to next line
			if (a % 5 == 0 ) {
				a++;
				//just got lazy here and make the program exit
				if(a == 26) 
					System.exit(0);
				//output for next line
				System.out.printf("\n%d\t", a);
			}
		}
	}
}
