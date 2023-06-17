public class Back_tracking {
    public static void print_permutation(String str,String perm){
        if (str.length()==0){
            System.out.println("final string..."+perm);
            return;
        }
        for (int i=0;i<str.length();i++){
            char current_char=str.charAt(i);
            String new_string=str.substring(0,i)+str.substring(i+1);
           print_permutation(new_string,perm+current_char);

        }
    }
    public static void main(String[] args) {
        String str="abc";
        print_permutation(str,"");

    }
}
