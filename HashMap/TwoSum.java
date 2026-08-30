import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        
        int arr[] = {2, 7, 11, 15};

        int target = 18;

        HashMap<Integer, Integer> map = new HashMap<>();

        
        for(int i = 0; i<arr.length ; i++) {
            int complement = target - arr[i];
        
            if(map.containsKey(complement)) {
                System.out.print(map.get(complement) + " " + i);
            }

            map.put(arr[i], i);
        }
    }
}
