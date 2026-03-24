import java.util.Scanner;

public class hollowdiamond {
    static void main() {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int m=n/2+1;
       for(int i=1; i<=m; i++){
           if(i==1){
               for(int j=1; j<=n; j++){
                   System.out.print("*");
               }
           }
           else {
               for (int k = 1; k <= m - i + 1; k++) {
                   System.out.print("*" );
               }
               for (int k = 1; k <= 2 * i - 3; k++) {
                   System.out.print(" ");
               }

               for (int k = 1; k <= m - i + 1; k++) {
                   System.out.print("*" );
               }
           }
           System.out.println();
       }
        for(int i=m-1; i>=1; i--){
            if(i==1){
                for(int j=1; j<=n; j++){
                    System.out.print("*");
                }
            }
            else {
                for (int k = 1; k <= m - i + 1; k++) {
                    System.out.print("*" );
                }
                for (int k = 1; k <= 2 * i - 3; k++) {
                    System.out.print(" ");
                }

                for (int k = 1; k <= m - i + 1; k++) {
                    System.out.print("*" );
                }
            }
            System.out.println();
        }



       }
    }

