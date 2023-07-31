public class Tree_Postorder {
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
    static class Binary_Tree{
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
    public static void Postorder(Node root){
        if (root==null){
            return;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.println(root.data);
    }
    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binary_Tree tree=new Binary_Tree();
        Node root=tree.BuildTree(node);
        Postorder(root);
    }
}
