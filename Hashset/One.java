import java.util.HashSet;
import java.util.Iterator;

public class One {
    public static void main(String[] args) {
        // Creating

        HashSet<Integer> set = new HashSet<>();
        // ArrayList<Integer> List = new ArrayList<>()

        // Insert 
        
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // Size
        System.out.println("size of set is: " + set.size());

        // Print all elements
        
        System.out.println(set);

        // Search - contains 

        // if(set.contains(1)) {
        //     System.out.println("Set contains 1");
        // }
        // if(!set.contains(6)) {
        //     System.out.println("Does not contain");
        // }

        // // Delete

        // set.remove(1);
        // if(!set.contains(1)) {
        //     System.out.println("Does not contain 1 - we deleted one");
        // }

        // Iterator

        Iterator it = set.iterator();

        // HasNext, Next 

        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
