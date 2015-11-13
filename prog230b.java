package compsciAP;

/*
 * Ulam hypothesis
 * Malcolm Speed 
 * Nov. 8, 2014
 * Eclipse IDE
 * 
 * Description:
 * 	print numbers that converge to 1
 * 
 * Difficulties:
 * 	none
 * 
 * What I learned:
 * 	nothing new
 */

public class prog230b {

	public static void main(String[] args) {
		
		//loop to count from 1 to 25
		for(int count = 1; count <= 25; count++) // 
        { 
			//variable that we can manipulate
			//without messing with the counter
            int num = count; 
            //prompts current number
            System.out.print("\n" + num + ": ");
            //loop and output the numbers until reaching 1
            do
            { 
            	//if our number is evev, divide by 2
                if(num % 2 == 0) 
                    num /= 2; 
                //otherwise, multiply by 3 and add by 1
                else 
                    num = 3 * num + 1; 
                //output numbers
                System.out.print(num + " "); 

            } while (num != 1);
        }
	}
} 
