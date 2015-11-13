package compsciAP;

public class histogram {

	/**
	 * print out asterisks based on given data
	 * @param amount - counter for how many times the asterisk is printed
	 * @return No return value
	 */
	public static void result(double amount) {
		for(int i = 0; i <= Math.round(amount) - 1; i++)
			System.out.print("*");
		
		System.out.print(" " + amount);
	}
	/**
	 * same as "result" function but asterisk is replaced by a special character
	 * of the user's choice
	 * @param amount
	 * @param str
	 */
	public static void result2(double amount, String str) {
		int i = 0;
		while(i <= Math.round(amount) - 1) {
			System.out.print(str);
			i++;
		}
		
		System.out.print(" " + amount);
	}
}
