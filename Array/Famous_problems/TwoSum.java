import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        
        int arr[] = {2, 7, 11, 15};

        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<arr.length; i++) {

            int required = target - arr[i];

            if(map.containsKey(required)) {
                System.out.print(
                    "Indexes: " + 
                    map.get(required) + " " + i
                );
                return;
            }
            map.put(arr[i], i);
        }
        System.out.println("No Pair found");
    }
}