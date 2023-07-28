public class Queue_circular {
    static class Queue{
         static int arr[];
        static int size;
        static int front=-1;
        static int rear =-1;
        Queue(int size){
            this.size=size;
            arr=new int[size];

        }
        public static boolean is_empty(){
            return  rear==-1 && front==-1;
        }
        public static boolean is_full(){
            return (rear+1)%size==front;
        }
        public static void add(int data){
            if (is_full()){
                System.out.println("Queue is full");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        public static int remove(){
            if (is_empty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int res=arr[front];
            if (front==rear){
                front=rear=-1;
            }else {
                front=(front+1)%size;
            }

            return res;
        }
        public static int peek(){
            if (is_empty()){
                System.out.println("is empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue(4);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        System.out.println(q.remove());
        q.add(6);

        while (!q.is_empty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
