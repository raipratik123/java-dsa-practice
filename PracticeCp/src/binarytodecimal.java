import java.util.Scanner;

import static java.lang.Math.pow;

public class binarytodecimal {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int binary=sc.nextInt();
        int sum=0;
        int a=0;
        while(binary!=0){
            int rem=binary%10;
            sum+=rem*pow(2,a);
            binary=binary/10;
            a++;
        }
        System.out.println(sum);
    }
}
