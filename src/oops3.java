//setname_getname
class my_employ{
    private int id;
    private String name;
    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
}
public class oops3 {
    public static void main(String[] args) {
        my_employ harry=new my_employ();
        harry.setId(45);
        harry.setName("vishwajeet");
        System.out.println(harry.getId()+" "+harry.getName());
    }
}
