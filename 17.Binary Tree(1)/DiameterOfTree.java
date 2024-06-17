public class DiameterOfTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int[] nodes){
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

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight,rightHeight) + 1;
    }

    static int max = 0;

    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int diameterLeft = diameter(root.left);
        int diameterRight = diameter(root.right);
        int diameterRoot = height(root.left) + height(root.right) + 1;
        max = Math.max(diameterRoot, Math.max(diameterLeft,diameterRight));
        return max;
    }
    
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(diameter(root));
    }
}
