
import java.util.HashSet;

public class Intersection {
    
    public static int intersect(int[] arr1, int[] arr2) {
        
        int n = arr1.length;
        int m = arr2.length;
        int count = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(arr1[i]);
        }

        for (int j = 0; j < m; j++) {
            if(set.contains(arr2[j])) {
                count++;
                set.remove(arr2[j]);
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int arr1[] = {7, 3, 9};
        int arr2[] = {7, 3, 9, 6, 2, 4};

        System.out.println(intersect(arr1, arr2));

    }
}
