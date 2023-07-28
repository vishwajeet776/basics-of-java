public class Queue_LL {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }
        static class Queue{
           static Node head = null;
           static Node tail=null;
           public static boolean is_empty(){
               return head == null && tail == null;
           }
            public static void add(int data){
               Node new_node=new Node(data);
               if (is_empty()){
                   tail=head=new_node;
               }
               else {
                   tail.next=new_node;
                   tail=new_node;
               }
            }
            public static int remove(){
               if (is_empty()){
                   System.out.println("Queue is empty");
                   return -1;
               }
               int front = head.data;
//               for single node
                if (head==tail){
                    tail=null;
                }
               head=head.next;
               return front;
            }
            public static int peek(){
               if (is_empty()){
                   System.out.println("is empty");
                   return -1;
               }
               return head.data;
            }
        }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.is_empty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
