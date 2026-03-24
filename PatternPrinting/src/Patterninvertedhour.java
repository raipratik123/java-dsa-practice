import java.util.Scanner;

public class Patterninvertedhour {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n+1; i++){
            int c=n;
            for(int j=1; j<=i; j++){
                System.out.print(c);
                c--;
            }
            for(int k=1; k<=2*(n-i)+1; k++){
                System.out.print(" ");
            }
            if(i==n+1){
                for(int j=1; j<=i-1; j++){
                    System.out.print(j);
                }
            }
           else{
               int j=c+1;
                for(int k=1;  k<=i; k++){
                    System.out.print(j);
                    j++;
                }
            }

            System.out.println();
        }
        for(int i=n; i>=1; i--){
            int c=n;
            for(int j=1; j<=i; j++){
                System.out.print(c);
                c--;
            }
            for(int k=1; k<=2*(n-i)+1; k++){
                System.out.print(" ");
            }
            if(i==n+1){
                for(int j=1; j<=i-1; j++){
                    System.out.print(j);
                }
            }
            else{
                int j=c+1;
                for(int k=1;  k<=i; k++){
                    System.out.print(j);
                    j++;
                }
            }

            System.out.println();
        }


    }
}
