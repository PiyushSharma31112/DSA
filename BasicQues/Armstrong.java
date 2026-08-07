import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int sum = 0;
        int digits = String.valueOf(n).length();
        int original = n;

        while(n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }

        if(sum == original) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Number is not Armstrong");
        }



    }
}
