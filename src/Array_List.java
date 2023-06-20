import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Array_List {
    public static void main(String[] args) {
//        Array list declaration
//        Integer
        ArrayList<Integer> list =new ArrayList<>();
//        String
        ArrayList<String> list1 =new ArrayList<>();
        ArrayList<Boolean> list3 =new ArrayList<>();
//        Add element
        list.add(2);
        list.add(6);
        list.add(3);
//        Add at Index
        list.add(1,1);
//        System.out.println(list.get(2));
//        set in index
        list.set(2,1);
//        Get output
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
//        Sort
        Collections.sort(list);
        System.out.println(list);
//        Delete
        list.remove(3);
        System.out.println(list);
    }
}
