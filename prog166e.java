package compsciAP;

/*
 * Program: Decimal EQuivalents
 * Malcolm Speed
 * Oct. 18, 2014
 * Eclipse IDE
 * 
 * Description:
 * 	prints a list a of fractions and their decimal equivalents
 * 
 * Difficulties:
 * 	none
 * 
 * What I learned:
 * 	nothing new
 */

public class prog166e {
    
    public static void main(String args[])
{
    // variables for our numerator and denominator
    int num = 1;
    int denom = 2;
    //loop following the pattern in the example
    for(denom = 2 ; (num <= denom) && (denom <=15); denom++) 
        for( num=1; num< denom; num++) //nested loop to give us our output
            System.out.printf("%d/%d   %.5f\n", num, denom ,((double) num/denom));      
    }
}
