import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        System.out.println("taking input");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st no.");
        int a = sc.nextInt();
//        System.out.println(a);
        System.out.println("enter 2st no.");
        int b= sc.nextInt();
        int sum;
        sum=a+b;
        System.out.println(sum);
        float c = sc.nextFloat();

    }
}