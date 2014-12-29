/*
	mRNA
	Malcolm Speed
	Dec. 2, 2014
	Manjaro Linux


	Description:
		Print all mRNA combinations

	Difficulties:
		None
*/

public class prog520a {

	public static void main(String[] args){
	
		String[] letters = {"A", "U", "C", "G"}; //String array to hold all the letters for possible combos

		for(int x = 0; x < 4; x++) { //first loop that reps the index of the first letter

			for(int y = 0; y < 4; y++) { // second letter

				for(int z = 0; z < 4; z++)  //third letter
					System.out.print(letters[x] + letters[y] + letters[z] + "  ");	//output	
				

				System.out.println(); //formatting
			}
		}
	}
}
