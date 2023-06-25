public class LLReverse {
    Node head;
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        public void reverseList() {
            if (head == null || head.next == null) {
                return;
            }
            Node prevNode = head;
            Node current_node = head.next;
            while (current_node != null) {
                Node nextNode = current_node.next;
                current_node.next = prevNode;
//                update
                prevNode = current_node;
                current_node = nextNode;
            }
            head.next=null;
            head=prevNode;
        }

        public void addLast(int data) {
            Node new_node = new Node(data);
            if (head==null){
                head = new_node;
                return;
            }
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new_node;
        }

        public void printLL() {
            Node current_node = head;
            while (current_node != null) {
                System.out.println(current_node.data);
                current_node = current_node.next;
            }
    }

    public static void main(String[] args) {
        LLReverse list=new LLReverse();
        list.addLast(5);
        list.addLast(4);
        list.addLast(3);
        list.addLast(2);
        list.printLL();
        list.reverseList();
        System.out.println("new  list");
        list.printLL();
    }
}
