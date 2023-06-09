import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        System.out.println("This is a Bubble sort program");
        Scanner sc=new Scanner(System.in);
        int temp=0;
        System.out.println("Enter arr length");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter arr of "+n);
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("In ascending order--");
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.print(+arr[i]+" ");
        }
        System.out.println();
        System.out.println("In descending order-- ");
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.print(+arr[i]+" ");
        }

        }
    }

