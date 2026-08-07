import java.util.*;

public class One {
    
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.isEmpty();
        }

        public void add(int data) {
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);

            if(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        public int remove() {
            if(isEmpty() == true) {
                System.out.println("Empty queue");
                return -1;
            }
            return s1.pop();
        }

        public int peek() {
            if(isEmpty() == true) {
                System.out.println("Empty queue");
                return -1;
            }
            return s1.peek();
        }
    }
    
    public static void main(String[] args) {
        Queue r = new Queue();

        r.add(1);
        r.add(2);
        r.add(3);
        r.add(4);
        r.add(5);
        r.add(6);

        while (!r.isEmpty()) {
            System.out.println(r.peek());
            r.remove();
        }

    }
}
