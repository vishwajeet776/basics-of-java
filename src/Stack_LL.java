public class Stack_LL {
//    StackLL
    static class Node{
        int data;
        Node Next;
        public Node(int data){
            this.data=data;
            this .Next=null;
        }
    }
  static class Stack{
        public static Node head;
        public static boolean is_empty(){
           return head == null;
        }
        public static void push(int data){
            Node new_node=new Node(data);
            if (is_empty()){
                head=new_node;
                return;
            }
            new_node.Next=head;
            head=new_node;
        }
        public static int pop(){
            if (is_empty()){
                return -1;
            }
            int top= head.data;
            head=head.Next;
            return top;
        }
      public static int peek(){
          if (is_empty()){
              return -1;
          }
          return head.data;
      }
  }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.is_empty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
