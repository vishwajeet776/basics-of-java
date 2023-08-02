public class Tree_NodeCount {
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
        public static Node Build_Tree(int node[]){
            idx++;
            if (node[idx]==-1){
                return null;
            }
            Node new_node=new Node(node[idx]);
            new_node.left=Build_Tree(node);
            new_node.right=Build_Tree(node);
            return new_node;
        }
    }
    public static int sum_node(Node root){
        if (root==null){
            return 0;
        }
        int left=sum_node(root.left);
        int right=sum_node(root.right);
        return left+right+root.data;
    }
    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binary_Tree tree=new Binary_Tree();
        Node root=tree.Build_Tree(node);
        System.out.println(root.data);
        System.out.println(sum_node(root));
    }
}
