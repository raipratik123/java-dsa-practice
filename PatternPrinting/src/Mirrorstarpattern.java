import java.util.Scanner;

public class Mirrorstarpattern {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m=n/2+1;
        for(int i=1; i<=m; i++){
            for(int j=0; j<m-i; j++){
                System.out.print("  ");
            }
            for(int k=0; k<2*i-1; k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        for(int i=m-1; i>0; i--){
            for(int j=0; j<m-i; j++){
                System.out.print("  ");
            }
            for(int k=0; k<2*i-1; k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}
