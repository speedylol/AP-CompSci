/*
	Program: population growth
	Malcolm Speed
	Oct. 9, 2014
	Manjaro Linux/ Java SDK

	Description:
		Outout a chart of the population growth from
		1990 to 2015.
	
	Difficulties:
		None

	What I learned:
		Nothing new

*/

public class prog162b {

	//global variables for the population and year
	static double pop;
	static int year;

	public static void main(String[] args) {

		year = 1990;
		
		//header output
		System.out.println("-----Growth Rate 2.9% annually-----");
		System.out.println("Year\tPopulation(in millions)");

		//for loop to increase population until it has doubled
		for(pop = 236; pop <= (236 * 2);){

			//increasing the population and incrementing the year
			pop += (pop * .029);
			year += 1;

			//formatted output
			System.out.printf("%d\t%d\n", year, (int) pop);

			//tests if the population has doubled yet and if so, outputs
			//the year it did then breaks off from the loop
			if (pop >= 236 * 2) {
				System.out.print("The population will double by year " + year);
				break;
			}
		}
	}
}
