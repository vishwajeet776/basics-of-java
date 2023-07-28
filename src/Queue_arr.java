//     Queue using array
public class Queue_arr {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        Queue(int size){
            this.size=size;
            arr=new int[size];
            rear=-1;
        }
        public static boolean is_empty(){
            return rear == -1;
        }
        public static boolean is_full(){

            return rear==size;
        }
        public static void add(int data){
            if(is_full()){
                System.out.println("over flow");
                return;
            }
            arr[++rear]=data;
        }
        public static int remove(){
            if (is_empty()){
                System.out.println("Is empty");
                return -1;
            }
            int front=arr[0];
            for (int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }
        public static int peek(){
            if (is_empty()){
                System.out.println("Empty Queue ");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
//        System.out.println(q.remove());
//        System.out.println(q.peek());
        while (!q.is_empty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
