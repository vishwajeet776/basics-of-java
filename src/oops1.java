//polymorphism
class employ{
    String name;
    int age;
    public void info(String name){
        System.out.println(name);
    }
    public void info(int age){
        System.out.println(age);
    }
    public void info(String name,int age){
        System.out.println(name+" "+age);
    }
}
public class oops1 {
    public static void main(String[] args) {
        employ emp1=new employ();
        emp1.age=24;
        emp1.name="vishwajeet";
        emp1.info(emp1.name,emp1.age);
    }

}
