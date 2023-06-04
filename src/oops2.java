//Inheritance

import java.util.Scanner;

//single Inheritance
class shape{
        public void area(int l, int h){
            System.out.println("area is");
        }
}
class triangle extends shape{
    public void set(int l,int h){
    }
    public void get(int l,int h){
        System.out.println((l*h)/2);
    }
}
public class oops2 {
    public static void main(String[] args) {
        shape t1=new triangle();
        Scanner sc=new Scanner(System.in);
        int l= sc.nextInt();
        int h = sc.nextInt();
        t1.area(l,h);
    }
}
