public class Pow {
   
    public static int calPow(int x, int n) {
        if(n == 0) {
            return 1;
        }

        if(x == 0) {
            return 0;
        }

        int xPownm1 = calPow(x, n-1);
        int xPown = x * xPownm1;

        return xPown;
    }
    
    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = calPow(x, n);
        System.out.println(ans);
    }
}
