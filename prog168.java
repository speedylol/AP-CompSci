public class prog168 {

	public static void main(String[] args) {

		int x_line = 1;
		int y_line = 20;
		
		for(int x = 0; x < 21; x++) {
			
			for(int xx = 0; xx < x_line; xx++) 
				System.out.print(" ");
			
			if(x >= 10) x_line--;
			else x_line++;
			
			System.out.print("x");

			for(int y = 0; y < y_line; y++ ) 
				System.out.print(" ");
			
			if(x >= 10) y_line += 2;
			else y_line -= 2;
			
			System.out.println("x");
		}
	}
}
