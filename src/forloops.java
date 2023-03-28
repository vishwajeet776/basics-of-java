import java.util.Scanner;

public class forloops {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a no.");
        int a = sc.nextInt();
        int c=0;
        for (int b=1;b<a;b++){
            c++;
            System.out.println("hello world "+c);

        }
    }
}
