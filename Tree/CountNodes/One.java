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

    public static void preOrder(Node root) {

        if(root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // Inorder
    
    public static void inOrder(Node root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // PostOrder

    public static void postOrder(Node root) {
        if(root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(+ root.data + " ");
    }


    // Level Traversal 

    public static void levelOrderTraversal(Node root) {
        
        if(root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        
        q.add(root);
        q.add(null);
        
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if(currNode == null) {
                System.out.println();
                if(q.isEmpty()){
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.println(currNode.data + " ");

                if(currNode.left != null) {
                    q.add(currNode.left);
                }
                if(currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int countNode(Node root) {

        if(root == null) {
            return 0;
        }

        int leftNodes = countNode(root.left);
        int rightNodes = countNode(root.right);
        
        return leftNodes + rightNodes + 1;
    }

    public static void main(String args[]) {
        
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        
        BinaryTreee tree = new BinaryTreee();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);

        // System.out.print("Pre-Order: ");
        // preOrder(root);
        // System.out.println();
        // System.out.print("In-Order: ");
        // inOrder(root);
        // System.out.println();
        // System.out.print("Post-Order: ");
        // postOrder(root);

        // levelOrderTraversal(root);

        System.out.println(countNode(root));
    }
}


