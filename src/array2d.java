import java.util.Scanner;

public class array2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        System.out.print("raw-");
        int n= sc.nextInt();
        System.out.print("clam-");
        int m=sc.nextInt();
        int matrix[][]=new int[n][m];
        System.out.println("enter array of "+n+","+m);
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print( matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
