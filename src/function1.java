import java.util.Scanner;

public class function1 {
    public static int add(int a,int b){
        int c=0;
        c=a+b;
        System.out.println("add is"+c);
        return c;
    }
    public  static int sub(int a,int b){
        int c;
        c=a-b;
        System.out.println("sub is"+c);
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two no.");
        int a= sc.nextInt();
        int b= sc.nextInt();
        add(a,b);
        sub(a,b);


    }
}
