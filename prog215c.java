public class prog215c {

   public static void main(String args[]) {
       
       int x = 0, y = 0;
       int prev = 0, max = 0;
       
       for(int i = 1; i < 100; i++) {
           prev = (100 * i) - ( 2 * (i * i));
           
           if( prev < max)     
               break;
           
           x = i;
           y = 100 - (2 * x);
           max = prev;
       }
       
       System.out.println("With 100 yards of fencing material");
       System.out.printf("A rectange %d X %d yards produces the maximum area of %d yards", x, y, max);
    }
}    
