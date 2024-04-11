import java.util.Scanner;
public class EligibleForVote {
    public static boolean Iseligible(int n){
        if(n>=18){
        return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(Iseligible(age));
        


        
    }
    
}
