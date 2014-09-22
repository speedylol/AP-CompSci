
public class prog54a {

	public static void main(String[] args)
	{

		System.out.println("1970 VW Bug averaged  " + averaging(286,9));
		System.out.println("1979 Firebird averaged  " + averaging(412,40));
		System.out.println("1980 Subaru averaged  " + averaging(361,18));
		System.out.println("1975 Cutlass averaged  " + averaging(161,11));
	}

	public static double averaging(int miles, int gallons)
	{
		double average = (miles / gallons);
		return Math.round(average);
	}

}
