import java.util.Scanner;

public class arrays4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of string");
        int n= sc.nextInt();
        String name[]=new String[n];

        for (int i=0;i<n;i++){
            name[i]=sc.next();
        }

        for (int i=0;i<n;i++){
            System.out.print(name[i]);
        }
    }

}
