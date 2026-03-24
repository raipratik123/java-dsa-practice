import java.util.Scanner;

public class Patterndoublesidedarroe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n / 2 + 1;

        // upper part
     for(int i=1; i<=m; i++){
         for(int j=1; j<=2*(m-i); j++){
             System.out.print(" ");
         }
         if(i==1){
             System.out.print(1);
         }
         else{
             for(int j=i; j>=1; j--){
                 System.out.print(j);
             }
             for(int k=1; k<=2*i-3; k++){
                 System.out.print(" ");
             }
             for(int k=1; k<=i; k++){
                 System.out.print(k);
             }
         }
         System.out.println();
     }
        for(int i=m-1; i>=1; i--){
            for(int j=1; j<=2*(m-i); j++){
                System.out.print(" ");
            }
            if(i==1){
                System.out.print(1);
            }
            else{
                for(int j=i; j>=1; j--){
                    System.out.print(j);
                }
                for(int k=1; k<=2*i-3; k++){
                    System.out.print(" ");
                }
                for(int k=1; k<=i; k++){
                    System.out.print(k);
                }
            }
            System.out.println();
        }
    }
}