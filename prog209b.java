package compsciAP;
/*
 * program: throwing three dice
 * Malcolm Speed
 * Oct. 27, 2014
 * Eclipse IDE
 * 
 * Description:
 * 	finds out how many ways 3 dice can add up to 9
 * 	or 10
 * 
 * Difficulties:
 * 	None
 * 
 * What I learned:
 * 	Nothing new
 * 
 */
public class prog209b {

	public static void main(String[] args){
	
		int count = 0;	//variable we will use to count 
						// possibilities of 9
		
		int count2 = 0;	//variable used to count possibilities of 10
		int sum; // variable used to test sum of the dice
		
		for(int i = 1; i<=6; i++) // dice 1 
		    for(int y=1; y<=6; y++) // dice 2
		        for(int x=1; x<=6; x++ ){ // dice 3
		        	
		             sum = i + y + x;
		             if(sum == 9) // raise our count of 9
		            	 count++;
		             if (sum == 10) // raise our count of 10
		                 count2++;
		         }
		//output
		System.out.printf("There are %d ways to get 9\n", count);
		System.out.printf("There are %d ways to get 10", count2);
	}
}
