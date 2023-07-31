public class Tree_Inorder {
    static class Node{
        int data;
         Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node BuildTree(int node[]){
            idx++;
            if (node[idx]==-1){
                return null;
            }
            Node new_node=new Node(node[idx]);
            new_node.left=BuildTree(node);
            new_node.right=BuildTree(node);
            return new_node;
        }
    }
    public static void inorder(Node root){
        if (root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.BuildTree(node);
        inorder(root);
    }
}
