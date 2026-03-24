import java.util.Scanner;

public class Replace {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        while(n!=0){
            int rem=n%10;
            if(rem==0){
                rev=rev*10+5;
            }
            else{
                rev=rev*10+rem;
            }
            n=n/10;
        }
       int c=rev;
        int ans=0;
        while(c!=0){
            int rem=c%10;
            ans=ans*10+rem;
            c=c/10;
        }
        System.out.println(ans);
    }
}
