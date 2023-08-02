public class Tree_Diameter {
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
     static class Tree_Info{
        int height;
        int diameter;
        Tree_Info(int height,int diameter){
            this.height=height;
            this.diameter=diameter;
        }
     }
     public static Tree_Info info(Node root){
        if (root==null){
            return new Tree_Info(0,0);
        }
        Tree_Info left=info(root.left);
        Tree_Info right=info(root.right);
        int MyHeight=Math.max(left.height,right.height)+1;
        int diam1=left.height+ right.height+1;
        int diam2= left.diameter;
        int diam3= right.diameter;
        int MyDiam=Math.max(diam1,Math.max(diam2,diam3));
        return new Tree_Info(MyHeight,MyDiam);
     }
    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binary_Tree tree=new Binary_Tree();
        Node root=tree.Build_Tree(node);
        System.out.println(root.data);
        System.out.println(info(root).diameter);
    }
}

