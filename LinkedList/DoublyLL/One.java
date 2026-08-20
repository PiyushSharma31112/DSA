class One {

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;

        }
    }

    Node head = null;

    void insertAtBeg(int data) {
        Node newNode =  new Node(data);

        if(head == null) {
            
            head = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    void deleteaAtBeg() {
        if(head == null ){
            System.out.println("List is empty");
            return;
        }

        head = head.next;

        if(head != null){
            head.prev = null;
        }
    }

    void deleteaAtEnd() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }

        if(head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        while(temp.next != null) {
            temp = temp.next;
        }

        
        temp.prev.next = null;
    }

    void displayForward() {
        Node temp = head;

        System.out.print("Forward: ");

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("Null");
    }

    void displayBackward() {
        if(head == null) {
            return;
        }

        Node temp = head;

        while(temp.next != null) {
            temp = temp.next;
        }

        System.out.print("Backward: ");

        while(temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }

        System.out.println("Null");
    }

    public static void main(String[] args) {
        One list = new One();

        list.insertAtBeg(10);
        list.insertAtBeg(20);

        list.insertAtEnd(40);
        list.insertAtEnd(50);

        list.displayForward();
        list.displayBackward();

        list.deleteaAtBeg();
        list.deleteaAtEnd();

        list.displayForward();
        list.displayBackward();

    }

}