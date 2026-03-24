public class append {
    static void main() {
        StringBuilder sb=new StringBuilder("Abc");
        System.out.println(sb);
        sb.append(35);
        System.out.println(sb);
        sb.append("abcd");
        System.out.println(sb);
        char[] ch={'a','b','v'};
        sb.append(ch);
        System.out.println(sb);
    }
}
