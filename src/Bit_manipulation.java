public class Bit_manipulation {
    public static void main(String[] args) {
        int a=5;
        int pos=1;
//GET BIT
        System.out.println(1<<pos);
        if ( (1<<pos&a)==0){
            System.out.println("bit was 0");
        }
        else {
            System.out.println("bit was 1");
        }
//SET BIT
        System.out.println((1<<pos | a));
        System.out.println(1<<pos&a);
    }
}
