import java.util.*;

public class Fib {
    public static void main(String[] args) {

        int a = 0, b = 1, fib;

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        if (n >= 1) System.out.print(a + " ");
        if (n >= 2) System.out.print(b + " ");

        for(int i = 2; i < n; i++) {
            fib = a + b;
            a = b;
            b = fib;
            System.out.print(fib + " ");
        }

    }
}
