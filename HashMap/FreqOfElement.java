import java.util.*;

public class FreqOfElement {

    public static void frequency(int[] arr) {

    HashMap<Integer, Integer> map = new HashMap<>();
    int n = arr.length;

    for (int i = 0; i<n; i++) {
        if(map.containsKey(arr[i])) {
            map.put(arr[i], map.get(arr[i]) + 1);
        } else {
            map.put(arr[i], 1);
        }
    }
    for(int key : map.keySet()) {
        System.out.println(key + " ---> " + map.get(key));
    }
    System.out.println(map);

}

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 2, 3};

        frequency(arr);
    }
}
