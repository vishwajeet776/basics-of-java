import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        String a= sc.nextLine();
        String b= sc.next();
        System.out.println(a);
        System.out.println(b);
        System.out.println(b.length());
        System.out.println(b.charAt(7));
//        for(int i=0;i<a.length();i++){
//            System.out.println(a.charAt(i));
//        }
        String c=sc.next();
        if(b.equals(c)){
            System.out.println("is equal");
        } else {
            System.out.println("is not equal");
        }
        System.out.println(b.substring(0,4));
    }
}
