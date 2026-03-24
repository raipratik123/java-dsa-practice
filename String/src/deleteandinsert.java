public class deleteandinsert {
    static void main() {
        StringBuilder sb=new StringBuilder("abcder");
        System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb);//abcer
        sb.delete(1,3);
        System.out.println(sb);
        sb.insert(1,'g');
        System.out.println(sb);

    }
}
