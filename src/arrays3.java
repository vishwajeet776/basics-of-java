import java.util.Scanner;

public class arrays3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no.");
        int n= sc.nextInt();
        int number[]=new int[n];
        for (int i=0;i<n;i++){
            System.out.print(i+" - ");
            number[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.println(number[i]);
        }
    }
}
