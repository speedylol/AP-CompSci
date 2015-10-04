public class triangle {

	/**
		Function to give us our output
		@param a - first side 
		@param b - second side
		@param c - third side
	*/

	public static void heron(int a, int b, int c) {

		double area;
		int s = ((a + b + c) / 2);

		double area2 = (s * (s-a) * (s-b) * (s-c));

		area = Math.sqrt(area2);

		//tests to see if we have a valid triangle then gives us output
		if(area2 <= 0) 
			System.out.printf("%d\t%d\t%d\t\tThis is not a triangle\n",a ,b ,c);
		else 
			System.out.printf("%d\t%d\t%d\t\t%.4f\n", a, b , c, area);
		
	}

}
