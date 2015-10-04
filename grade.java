
public class grade {

	public int quiz1;
	public int quiz2;
	public int midterm;
	public int theFinal;

	//Constructor
	public grade(int a, int b, int mid, int fin) {
		
		quiz1 = a;
		quiz2 = b;
		midterm = mid;
		theFinal = fin;
	}

	/**
	* Setter functions
	*/
	private double findQuizAvg() {
		
		double quizAvg = (((quiz1 * 10 + quiz2 * 10) / 2) * .25); 
		return quizAvg;
	}

	private double findMidAvg() {
		double midAvg = (midterm * .25);
		return midAvg;
	}
	
	private double findFinalAvg() {
		double finalAvg = (theFinal * .50);
		return finalAvg;
	}


	/**
	*Getter functions to retrieve the averages
	*/
	public double getQuizAvg() {
		double g1 = findQuizAvg();
		return g1;
	}

	public double getMidAvg() {
		double g2 = findMidAvg();
		return g2;
	}

	public double getFinalAvg() {
		double g3 = findFinalAvg();
		return g3;
	}
}







