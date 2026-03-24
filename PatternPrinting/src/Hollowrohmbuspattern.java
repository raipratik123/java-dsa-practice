import java.util.Scanner;

public class Hollowrohmbuspattern {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            if(i==1 || i==n){
                for(int k=1; k<=n; k++) {
                    System.out.print("*");
                }
            }
            if(i!=1 && i!=n){
                for(int k=1; k<=n; k++){
                    if(k==1 || k==n){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
