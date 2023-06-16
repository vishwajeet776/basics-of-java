public class Recursion {
    public static void print_no(int n){
        if(n==0){
            return;
        }
        System.out.println(n);

        print_no(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        print_no(n);
    }
}
