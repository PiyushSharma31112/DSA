import java.util.*;

public class FirstRepeat {
    
    public static int firstrepeatElement(int arr[]) {
        
        HashSet<Integer> set = new HashSet<>();
        
        
        for(int num : arr) {
            if(set.contains(num)) {
                return num;
            }
            set.add(num);
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 4, 3, 5};
        System.out.println(firstrepeatElement(arr));
    }
}