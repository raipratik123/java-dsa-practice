import java.util.Scanner;

public class Lcm {
    public static int gcd(int a, int b){
//            while(b != 0) {
//                int temp = b;
//                b = a % b;
//                a = temp;
//            }
//            return a;
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
        }

        static void main() {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        int ans=gcd(a,b);
            System.out.println(ans);
        int lcm=(a*b)/ans;
        System.out.println(lcm);
    }
}
