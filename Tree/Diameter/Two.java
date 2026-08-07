

public class Two{

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

    public static int height(Node root) {
        if(root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int myHeight = leftHeight + rightHeight + 1;

        return myHeight;
        
    }

    static class TreeInfo {
        int height;
        int diam;

        // Constructor
        TreeInfo(int height, int diam) {
            this.height = height;
            this.diam = diam;
        }
    }

    // Optimized Diameter Function
    public static TreeInfo diameter2(Node root) {

        if (root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.height, right.height) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.height + right.height + 1;

        int myDiam = Math.max(Math.max(diam1, diam2), diam3);

        return new TreeInfo(myHeight, myDiam);
    }


    public static void main(String args[]) {

        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTreee tree = new BinaryTreee();
        Node root = tree.buildTree(nodes);

        System.out.println(diameter2(root).diam);
    }
}

