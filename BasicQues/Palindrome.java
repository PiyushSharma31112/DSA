import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int original = n;
        int rev = 0;

        while(n > 0) {

            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }

        if(original == rev) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }
    }
}
