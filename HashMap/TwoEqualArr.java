import java.util.HashMap;

public class TwoEqualArr {
    
    public static boolean equal(int arr1[], int arr2[]) {
        
        if(arr1.length != arr2.length) {
            return false;
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr1) {
            map.put(num, map.getOrDefault(num, 0)  + 1);
        }

        for(int num : arr2) {
            
            if(!map.containsKey(num)) {
                return false;
            }
            map.put(num, map.get(num) - 1);
        }

        for(int value : map.values()) {
            if(value != 0) {
                return false;
            }
        }

        return true;
    }
    
    public static void main(String[] args) {
    
        int[] arr1 = {1, 2, 2, 3};
        int[] arr2 = {2, 3, 2, 1};
    
        System.out.println(equal(arr1, arr2));
    }
}
