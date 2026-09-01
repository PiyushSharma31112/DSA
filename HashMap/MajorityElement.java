import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {

        int arr[] = {2, 2, 1, 1, 1, 2, 2};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num : map.keySet()) {
            if(map.get(num) > arr.length / 2) {
                System.out.println("Majority Element: " + num);
                return;
            }
        }
        
        System.out.println("No majority Element");
    }
}
