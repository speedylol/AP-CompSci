public class FamilyStats
{

	public static void main(String[] args)
	{
		int momsage = 42;
		int dadage = 43;
		int myage = 22;
		int sistersage = 16;
		int dogsage = 6;

		double agesum=(momsage + dadage + myage + sistersage + dogsage);
		double average = agesum / 5;
	
		double variance = 0.0;
		variance += (momsage - average) * (momsage - average);
		variance += (dadage -average) * (dadage - average);
		variance += (myage - average)* (myage -average ) ;
		variance += (sistersage - average) * (sistersage - average);
		variance += (dogsage - average) * (dogsage - average);
		variance = variance / 4;

		double standdev = Math.sqrt(variance);
		System.out.println("The sample age is: " + average);
		System.out.println("The sample variance is: " + variance);
		System.out.println("The sample age standard deviation is: " + standdev);

	}

}
