public class PlaceTiles {
    
    public static int placeTile(int n, int m) {
        
        if(n == m) {
            return 2;
        }

        if (n < m) {
            return 1;
        }


        // Place vertically
        int vertplacements = placeTile(n-m, m);

        // place horizonatally
        int horizonatally = placeTile(n-1, m);

        return vertplacements + horizonatally;

    }

    public static void main(String[] args) {
        int n = 4, m = 2;

        int total = placeTile(n, m);

        System.out.println(total);
    }
}
