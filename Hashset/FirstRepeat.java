import java.util.*;

public class FirstRepeat {
    
    public static int firstrepeatElement(int arr[]) {
        
        HashSet<Integer> set = new HashSet<>();
        
        
        for(int i = arr.length-1; i >= 0; i--){
            if(set.contains(arr[i])){
                return i;
            }
            set.add(arr[i]);
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 3, 5, 6};
        System.out.println(firstrepeatElement(arr));
    }
}