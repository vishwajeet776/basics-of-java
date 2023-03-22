import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        //if else
        //1
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        int age= sc.nextInt();
        System.out.println(age);
        if (age > 18){
            System.out.println("adult");
        }
        else {
            System.out.println("not adult");
        }
        //2
        System.out.println("enter no");
        int No = sc.nextInt();
        if (No%2==0){
            System.out.println(No+" is even no");
        }
        else {
            System.out.println(No+" is odd no");
        }
      //else if

        System.out.println("enter 2 no");
        int a= sc.nextInt();
        int b= sc.nextInt();
        if (a==b){
            System.out.println("no is equal");
        }
        else if (a>b){
            System.out.println(a+" is greater");
        }
        else{
            System.out.println(b+" is greater");
        }
    }
}
