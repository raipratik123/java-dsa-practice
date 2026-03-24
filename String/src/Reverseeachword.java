import java.util.Scanner;

public class Reverseeachword {
    public static void reverse(StringBuilder sb ,int i, int j){
        while(i<j){
            char temp=sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder(sc.nextLine());
        int i=0; int j=0;
        while(j<sb.length()){
            if(sb.charAt(j)==' '){
                 reverse(sb,i,j-1);
                 i=j+1;
                 j=i;
            }else{
                j++;
            }

        }
        reverse(sb,i,j-1);
        System.out.println(sb);
    }
}
