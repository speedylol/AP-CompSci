import java.util.Scanner;

public class prog212a {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        // array to keep track of the time
        int[] time = {9, 10, 11, 12, 1, 2};
        int passTrain = 0;
        int freightTrain = 0;
        int i = 0; int i2 = 0;

        System.out.print("Enter the speed of the passengers train: ");
        int user = input.nextInt();         
        
        do {
            freightTrain += 50;
            
            if(i >= 11) 
                passTrain += user;
            
            i2++;
            i = i2;
            i = time[i];            
            
            //System.out.println(passTrain + " " + freightTrain); 
            
            if(passTrain == freightTrain) {
                System.out.printf("passed at %d",  time[i2]);
                System.out.println("The freight train was traveling 50 mph");
                System.out.println("The passenger train was traveling " + user + " mph");
                System.exit(0);
            }       
                    
        } while (passTrain <= 200 && freightTrain <= 200);
        
        
        System.out.printf("passed at %d and %d 'o clock\n", i-1,  time[i2]);
        System.out.println("The freight train was traveling 50 mph");
        System.out.println("The passenger train was traveling " + user + " mph");
        System.exit(0);
    }
}
