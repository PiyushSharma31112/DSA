package LinkedList.Singly;
public class one {
  
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
        public static Node head;
        public static Node tail;

        public static int size;
        
        public void addFirst(int data) {
            Node newNode = new Node(data);
            size++;
            if(head == null) {
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public void addLast(int data){
            Node newNode = new Node(data);
            size++;

            if(head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public  void display(){
            Node temp = head;

            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Node ll = new Node(10);
        ll.addFirst(5);
        ll.addLast(15);
        ll.display();
    }
}
