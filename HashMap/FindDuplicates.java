import java.util.HashMap;

public class FindDuplicates {
    
   public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 2, 4, 5, 1, 3};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        System.out.println("Duplicates elements: ");

        for(int num  : map.keySet()) {
            if(map.get(num) > 1) {
                System.out.println(num);
            }
        }
    }
}