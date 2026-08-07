import java.util.*;

public class One {

    static class Node {
        int data;
        Node left;
        Node right;
        
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTreee{
        
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static int sumOfNode(Node root) {
        if(root == null) {
            return 0;
        }   

        int leftSum = sumOfNode(root.left);
        int rightSum = sumOfNode(root.right);
        
        return leftSum + rightSum + root.data;
   }



    public static void main(String args[]) {
        
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        
        BinaryTreee tree = new BinaryTreee();
        Node root = tree.buildTree(nodes);
        

        System.out.println(sumOfNode(root));

    }
}


