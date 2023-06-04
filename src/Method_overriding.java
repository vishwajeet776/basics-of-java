class A{
    public void meth1(){
        System.out.println("i am method 1 of class A");
    }
}
class B extends A{
  public void meth1(){
      System.out.println("i am method 2 of class B");
  }
}
public class Method_overriding {
    public static void main(String[] args) {
        A a=new A();
        a.meth1();
        B b=new B();
        b.meth1();

    }
}
