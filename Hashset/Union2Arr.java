
import java.util.HashSet;

public class Union2Arr {
    
    public static void union(int arr1[], int[] arr2) {
        
        HashSet<Integer> set = new HashSet<>();

        int n = arr1.length;
        int m = arr2.length;

        for(int i = 0; i<n; i++) {
            set.add(arr1[1]);
        }

        for(int i = 0; i<m; i++) {
            set.add(arr2[i]);
        }

        System.out.println(set.size() + " " + set);
    }
    
    public static void main(String[] args) {

        int arr1[] = {7, 3, 9};
        int arr2[] = {7, 3, 9, 6, 2, 4};

        union(arr1, arr2);

    }
}
