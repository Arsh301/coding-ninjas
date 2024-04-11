import java.util.Scanner;

public class Circumference {
    public static Double circle( Double radius){
      Double cal = 2*3.14*radius;
      return cal;
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Double r = sc.nextDouble();
    System.out.println(circle(r));

   }
        


        
    }
    

