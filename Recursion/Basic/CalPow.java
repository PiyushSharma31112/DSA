public class CalPow {
    
    public static int pow(int x, int n) {
        if(n == 0) {
            return 1;
        }

        if(x == 0) {
            return 0;
        }

        // compute pow(x, n) using divide-and-conquer
        int half = pow(x, n/2);
        if(n % 2 == 0) {
            return half * half;
        } else { // if n is odd
            return half * half * x;
        }

    } 

    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = pow(x, n);
        System.out.println(ans);
    }
}
