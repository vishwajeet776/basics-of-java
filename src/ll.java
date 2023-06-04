import java.util.LinkedList;

class ll {
     public static void main(String[] args) {
         LinkedList<Integer> list=new LinkedList<>();
         list.add(1);
         list.add(3);
         list.add(4);
         System.out.println(list);
         list.add(1,2);
         System.out.println("new list "+list);
         list.remove(3);
         System.out.println("new list "+list);
         list.set(2,10);
         System.out.println("new list "+list);
         list.add(14);
         System.out.println(list);
         list.addFirst(20);
         System.out.println(" add first "+list);
         System.out.println(list.get(1));
         for (int i=0;i<list.size();i++){
             System.out.print(list.get(i));
             System.out.print(",");

         }
     }
}
