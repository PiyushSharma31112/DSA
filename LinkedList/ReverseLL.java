class ReverseLL {
    
    public class ListNode {
       int data;
       ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public ListNode reverse(ListNode head) {
        
        if(head == null || head.next == null) {
            return head;
        }

        ListNode prevNode = head;
        ListNode currNode = head.next;

        while(currNode != null) {
            
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = nextNode;
        }

        head = null;
        head = prevNode;
        return prevNode;
    }

    public static void printList(ListNode head) {
        ListNode curr = head;
        
        while(curr != null) {
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args){

    }
}
