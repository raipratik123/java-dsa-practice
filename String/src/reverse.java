import java.util.Scanner;

public class reverse {
    static void main() {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder(sc.nextLine());

        int j=sb.length()-1;
        int i=0;
       while(i<j){

           char temp=sb.charAt(i);
         sb.setCharAt(i,sb.charAt(j));
           sb.setCharAt(j,temp);
           i++;
           j--;


       }
       //sb.reverse bultin function
        System.out.println(sb);
    }
}
