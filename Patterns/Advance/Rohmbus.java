public class Rohmbus {
    public static void main(String[] args) {
        
        int n = 5;

        for(int i = 1; i<=n; i++) {

            int spaces = n-i;

            for(int j =1; j<= spaces; j++) {
                System.out.print(" ");
            }

            // stars

            for(int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }    
}
