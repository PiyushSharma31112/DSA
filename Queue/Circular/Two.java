import java.util.*;

public class Two {
    
   public static void main(String[] args) {
        Queue<Integer> r = new LinkedList<>();

        r.add(1);
        r.add(2);
        r.add(3);
        r.add(4);
        r.add(5);

        while(!r.isEmpty()) {
            System.out.println(r.peek());
            r.remove();
        }
   }

}
