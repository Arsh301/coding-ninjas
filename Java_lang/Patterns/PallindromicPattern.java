import java.util.Scanner;
public class PallindromicPattern {
    public static void main(String[] args) {
      Scanner s= new Scanner(System.in);
      int n = s.nextInt();
      
      for(int i=1;i<=n;i++){
        // spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        // first half numbers
        for(int j=i;j>=1;j--){
            System.out.print(j);
        }
        // second half numbers
        for(int j=2;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
      }
    }
    
}
