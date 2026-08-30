import java.util.*;

public class NonRepeatingChar {
    public static void main(String[] args) {

        String str = "leetcode";

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(char ch : str.toCharArray()) {
            if(map.get(ch) == 1) {
                System.out.println(ch);
                break;
            }
        }

    }    
}
