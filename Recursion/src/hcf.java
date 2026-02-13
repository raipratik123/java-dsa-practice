import java.util.Scanner;
public class hcf {
        static int gcd(int a,int b){
//         for (int i=Math.min(a,b); i>1; i--){
//             if(a%i==0 && b%i==0){
//                 return i;
//             }

            if(b%a==0){
                return a;
            }

            return gcd(b%a,a);
        }
        static void main() {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
//        System.out.print(hcf(a,b));
            System.out.println(gcd(a,b));

        }
    }


