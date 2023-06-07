public class Strings_builder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("abc");
        System.out.println(sb);
        System.out.println(sb.charAt(1));
        sb.insert(0,"r");
        System.out.println(sb);
        sb.delete(0,2);
        System.out.println(sb);
        sb.append("a");
        System.out.println(sb);
        sb.append(1);
        System.out.println(sb);
        System.out.println(sb.length());

    }

}
