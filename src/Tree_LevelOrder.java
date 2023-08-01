import java.util.LinkedList;
import java.util.Queue;

public class Tree_LevelOrder {
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
        static class Binary_tree{
            static int idx=-1;
            public static Node Build_tree(int node[]){
                idx++;
                if (node[idx]==-1){
                    return null;
                }
                Node new_node=new Node(node[idx]);
                new_node.left=Build_tree(node);
                new_node.right=Build_tree(node);
                return new_node;
            }
        }
        public static void postorder(Node root){
            if (root==null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
        }
        public static void LevelOrder(Node root){
        if (root==null){
            return;
        }
            Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            Node curr=q.remove();
            if (curr==null){
                System.out.println();
//                queue is empty
                if (q.isEmpty()){
                    break;
                }else {
                    q.add(null);
                }
            }else {
                System.out.print(curr.data+" ");
                if (curr.left!=null){
                    q.add(curr.left);
                }
                if (curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binary_tree tree=new Binary_tree();
        Node root=tree.Build_tree(node);
        LevelOrder(root);
        System.out.println("*********");
        postorder(root);
    }
}
