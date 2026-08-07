import java.util.*;

// class One {
//     public static void main(String[] args) {
//         int n = 10, k = 5;
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("numbers of candies you want ?");
//         int m = sc.nextInt();

//         if (m > (n-k) || m <= 0) {
//             System.out.println("INVALID INPUT");
//         } else {
            
//             int available = n - m;

//             if(available == k) {
//                 available = n; //refill jar
//             }
//             System.out.println("NUMBERS OF CANDIES SOLD: " + m);
//             System.out.println("NUMBERS OF CANDIES AVAILABLE: " + available);
//         }
//         sc.close();
//     }
// }


public class One {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int capacity = 10;
        int minCandies = 5;
        int candiesInJar = capacity;

        while (true) {

            System.out.println("\nCandies Available: " + candiesInJar);
            System.out.print("Enter candies to purchase (0 to exit): ");

            int order = sc.nextInt();

            if (order == 0) {
                break;
            }

            if (order <= 0 || order > (candiesInJar - minCandies)) {
                System.out.println("INVALID INPUT");
                continue;
            }

            candiesInJar -= order;

            System.out.println("NUMBER OF CANDIES SOLD : " + order);

            if (candiesInJar == minCandies) {
                candiesInJar = capacity; // refill
            }

            System.out.println("NUMBER OF CANDIES AVAILABLE : " + candiesInJar);
        }

        sc.close();
    }
}