import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.");
        int n=sc.nextInt();
          int c=1;
        for (int i=1;i<n;i++){
            for (int j=1;j<n;j++){
                System.out.print(" "+c+" ");
                c++;
            }
            System.out.println();
        }

    }
}

