import java.util.Scanner;
import java.io.*;

/*
	Final Grades
	Malcolm Speed
	1/31/2015
	Manjaro Linux/ Java SDK

	Description:
		Gets students averages and grades

	Difficulties:
		None
*/

public class prog349f {

	static Scanner input = null;
	public static void main(String[] args) {

		//Header
		System.out.println("Student  Quiz 1  Quiz 2   MidTerm  Final  Final %   Grade");

		try {
			
			input = new Scanner(new File("class.txt"));

		} catch(FileNotFoundException e) { System.exit(0); }

		int i = 1; //number for our current student
		while(input.hasNextInt()) {
		
			System.out.print(i);
			
			//gets the four numbers per line in txt file
			int q1 = input.nextInt();
			int q2 = input.nextInt();
			int midterm = input.nextInt();
			int finals = input.nextInt();
	
			//create object for our grade class
			grade newGrade = new grade(q1,q2,midterm,finals);
			
			//calling getter functions in seperate class
			//and setting them to appropiate variable
			double Grade1 = (newGrade.getQuizAvg());
			double Grade2 = (newGrade.getMidAvg());
			double Grade3 = (newGrade.getFinalAvg());
			int finalPer = (int) (Grade1 + Grade2 + Grade3);

			System.out.format("%12d", q1);
			System.out.format("%8d", q2);
			System.out.format("%8d", midterm);
			System.out.format("%8d", finals);
			System.out.format("%8d", finalPer);

			//conditions to decide grade
			if (finalPer < 60)
				System.out.println("\t\tF");
			else if(finalPer > 60 && finalPer < 70)
				System.out.println("\t\tD");
			else if(finalPer > 70 && finalPer < 80)
				System.out.println("\t\tC");
			else if(finalPer > 80 && finalPer < 90)
				System.out.println("\t\tB");
			else if(finalPer >= 90) 
				System.out.println("\t\tA");

			i++; //increment to next student
		}
	}
}
