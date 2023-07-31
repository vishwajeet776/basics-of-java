public class Trees {
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
        static class BinaryTree{
            static int idx=-1;
           public static Node BuildTree(int node[]){
               idx++;
               if (node[idx]==-1) {
                   return null;
               }
               Node newNode=new Node(node[idx]);
               newNode.left=BuildTree(node);
               newNode.right=BuildTree(node);
               return newNode;
           }

        }
    public static void Preorder(Node root){
        if (root==null){
            return;
        }
        System.out.println(root.data);
        Preorder(root.left);
        Preorder(root.right);
    }
    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.BuildTree(node);
        Preorder(root);
    }
}
