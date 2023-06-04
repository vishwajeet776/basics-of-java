class pen{
    String color;
    String type;
    public void write(){
        System.out.println("writing");
    }
    public void color(){
        System.out.println(this.color);
    }

}
class student{
    String name;
    int age;
    public void info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class oops {
    public static void main(String[] args) {

        //pen class

        pen pen1=new pen();
        pen1.color="blue";
        pen1.type="ball";
        pen1.write();
//        System.out.println(pen1.color);
//        System.out.println(pen1.type);
        pen pen2=new pen();
        pen2.color="black";
        pen2.type="gel";
        pen2.write();
//        System.out.println(pen2.color);
//        System.out.println(pen2.type);
        pen1.color();
        pen2.color();

        //student class

        student s1=new student();
        s1.name="Vishwajeet";
        s1.age=21;
        s1.info();

    }

}
