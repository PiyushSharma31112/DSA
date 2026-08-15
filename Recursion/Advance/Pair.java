public class Pair {

    public static int findPair(int n) {

        if(n <= 1) {
            return 1;
        }

        // single call
        int ways1 = findPair(n-1);

        // Pair call

        int ways2 = (n-1) * findPair(n-2);

        return ways1 + ways2;

    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(findPair(n));
    }
}
