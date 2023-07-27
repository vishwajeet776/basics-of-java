import java.util.ArrayList;
import java.util.Stack;

public class Stack_Array {
    class stack{
       static ArrayList<Integer> list= new ArrayList<>();
        public static boolean is_empty(){
            return  list.size()==0;
        }
//        push
        public static void push(int data){
            list.add(data);
        }
//        pop
        public static int pop(int data){
            if (is_empty()){
                return -1;
            }
            int top= list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek(int data){
            if (is_empty()){
                return -1;
            }
            return list.get(list.size())-1;
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
