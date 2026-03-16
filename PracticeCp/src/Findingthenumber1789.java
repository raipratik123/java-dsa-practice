import java.util.Arrays;
import java.util.Scanner;

public class Findingthenumber1789 {
    public static int gcd(int a, int b){
        while(b!=0){
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            if (arr.length == 1) {
                System.out.println("Yes");
            }
            int g=arr[0];
            boolean flag=true;
            for(int i=1; i<n; i++){
              g =gcd(g,arr[i]);
              if(g>i+1){
                  flag=false;
                  break;
              }
            }
            if(flag) System.out.println("Yes");
            else System.out.println("No");

        }
    }
}

