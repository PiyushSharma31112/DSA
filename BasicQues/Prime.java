
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int c = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
    
        if(n <= 0) {
            System.out.println("Please enter a valid number.");
        } else {
            
            for (int i = 1; i <= n; i++) {
                if(n%i == 0) {
                    c++;
                }
            }

            if(c == 2) {
                System.out.println("Number is prime !");
            } else {
                System.out.println("Number is not prime !");
            }
        }    
    }
}
