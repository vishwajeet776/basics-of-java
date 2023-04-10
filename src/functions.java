import java.util.Scanner;

public class functions {
    public static void PrintMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System . in);
        System.out.println("enter name");
        String name= sc.next();
        PrintMyName(name);
    }
}
