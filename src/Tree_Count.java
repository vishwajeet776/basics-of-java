public class Tree_Count {
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
//    count node
public static int CountNode(Node root){
       if (root==null){
           return 0;
       }
       int LeftNode=CountNode(root.left);
       int RightNode=CountNode(root.right);
       return LeftNode+RightNode+1;

}
    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        Binary_Tree tree=new Binary_Tree();
        Node root=tree.Build_Tree(node);

        System.out.println(CountNode(root));
    }
}