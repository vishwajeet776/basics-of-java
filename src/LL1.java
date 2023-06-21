public class LL1 {
    Node head;
    class Node {
        String data;
        Node next;


        Node(String data) {
            this.data =data;
            this.next = null;

        }
    }
    public  void addFirst(String data){
        Node new_node=new Node(data);
        if (head==null){
            head=new_node;
            return;
        }
        new_node.next=head;
        head = new_node;
    }
    public void addLast(String data){
        Node new_node=new Node(data);
        if (head==null){
            head=new_node;
            return;
        }
        Node current=head;
        while (current.next != null){
            current=current.next;
        }
        current.next=new_node;
    }
    public void deleteFirst(){
        if (head==null){
            System.out.println("this is empty list");
            return;
        }
        head=head.next;
    }
    public void deleteLast(){
        if (head==null){
            System.out.println("this is empty list");
        }
        if (head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node last=head.next;
        while (last.next!= null){
            last=last.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;

    }

    public void printList(){

        Node current=head;
        while (current != null){
            System.out.print(current.data);
            current=current.next;
        }

    }
    public static void main(String[] args) {
        LL1 list=new LL1();
//        addFirst
        list.addFirst("is");
        list.addLast(" a");
        list.printList();
        System.out.println();
//        addLast
        list.addLast(" list");
        list.printList();
        System.out.println();
        list.addFirst("This ");
        list.printList();
        System.out.println();
//        deleteFirst
        list.deleteFirst();
       list.printList();
        System.out.println();
//        deleteLast
        list.deleteLast();
        list.printList();
    }
}
