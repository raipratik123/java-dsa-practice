import java.util.Scanner;

public class reverse {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int rev=0;
        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println(rev);
    }
}
