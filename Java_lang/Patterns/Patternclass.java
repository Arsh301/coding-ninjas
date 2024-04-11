import java.util.Scanner;
public class Patternclass {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int x = s.nextInt();
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                System.out.print("*");
            }
            System.out.println();       
         }
        
    }
    
}
