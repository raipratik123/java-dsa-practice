import java.util.Scanner;

import static java.lang.Math.pow;

public class Primearmstrongnumber {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int original=n;
        while(n!=0){
            n=n/10;
            c++;
        }
        int ans = 0;
        int a = original;
        while(a!=0){
            int rem=a%10;
            ans+=pow(rem,c);
            a=a/10;
        }

        if(ans==original){
            System.out.println("Yes ");
        }
        else{
            System.out.println("No");
        }

    }
}
