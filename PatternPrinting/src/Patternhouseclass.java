import java.util.Scanner;

public class Patternhouseclass {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1; i<=n+1; i++){
            for(int k=1; k<=i-1 ; k++){
                System.out.print(" ");
            }
            int c=n-i+1;
            for(int k=1; k<=n-i+2; k++ ){
                System.out.print(c);
                c--;
            }
            for(int k=1; k<=n-i+1; k++){
                System.out.print(k);
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int k=1; k<=i-1 ; k++){
                System.out.print(" ");
            }
            int c=n-i+1;
            for(int k=1; k<=n-i+2; k++ ){
                System.out.print(c);
                c--;
            }
            for(int k=1; k<=n-i+1; k++){
                System.out.print(k);
            }
            System.out.println();
        }

    }
}
