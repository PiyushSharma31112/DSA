import java.util.*;

public class NonRepeating {
    
    public static int nonrepet(int arr[]) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num : arr) {
            if(map.get(num) == 1) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        
        int[] arr = {4, 5, 1, 2, 1, 5, 4, 3};

        System.out.println(nonrepet(arr));
    }

}
