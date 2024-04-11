import java.util.Scanner;
public class FibonacciNumber {
    public static void fibonacci(int n){
    //     int a = 0, b = 1;
          
    //    System.out.print(a+" ");
      
    //    if(n > 1) {
    //        //find nth term
    //        for(int i=2; i<=n; i++) {
    //            System.out.print(b+" ");
    //            //the concept below is called swapping
    //            int temp = b;
    //            b = a + b;
    //            a = temp;
    //        }
    //        System.out.println();

    //     }

    int num1 = 0, num2 = 1;
      
        for (int i = 0; i < n; i++) {
            // Print the number
            System.out.print(num1 + " ");

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(n);
        
    }
    
}
