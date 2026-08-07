// circular queue using Linked list

class One {
    static class Node {
        int data;
        Node next;
    
        Node(int data) {
            this.data = data;
            next = null;
        } 
    }   

    static class Queue {
        Node head = null;
        Node tail = null;

        public boolean isEmpty() {
            return head == null && tail == null;
        }

        //  Enqueue

        public void add(int data) {
            Node newNode = new Node(data);

            if(tail == null) {
                tail = head = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        //  Dequeue

        public int remove() {
            if(isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            int front = head.data;
            head = head.next;

            return front;
        }

        //  peek 

        public int peek() {
            if(isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {

        Queue s = new Queue();

        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.remove();
        }
        
    }

}