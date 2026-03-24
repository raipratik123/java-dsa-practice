import java.util.Scanner;

import static java.lang.Math.pow;


public class Vonnumanproblem {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        int i=0;
        while(n!=0){
            int rem=n%10;
            ans+=rem*(pow(2,i));
            i++;
            n=n/10;
        }
        System.out.println(ans);
    }
}
