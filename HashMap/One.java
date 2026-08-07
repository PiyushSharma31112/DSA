import java.util.HashMap;

public class One {
    public static void main(String[] args) {
        
        // Country(Key), population(value)
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion

        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        // System.out.println(map);

        map.put("India", 180);
        // System.out.println(map);

        // Search

        // if(map.containsKey("China")) {
        //     System.out.println("Key is present in the map");
        // } else {
        //     System.out.println("Key is not present in the map");
        // }
        // System.out.println(map.get("China")); // key exists
        // System.out.println(map.get("Indonesia")); // ket doesn't exist
   
        // int arr[] = {12, 15, 18};
        
        // for(int i = 0; i<3; i++) {
        //     System.out.println(arr[i] + " ");
        // }
        // System.out.println();

        // for(int val : arr) {
        //     System.out.println(val + " ");
        // }
        // System.out.println();

        // for( Map.Entry<String, Integer> e : map.entrySet()) {
        //     System.out.println(e.getKey());
        //     System.out.println(e.getValue());
        // }

        // Set<String> keys = map.keySet();

        // for(String key : keys) {
        //     System.out.println(key + " " + map.get(key));
        // }

        map.remove("China");
        System.out.println(map);
    }
}
