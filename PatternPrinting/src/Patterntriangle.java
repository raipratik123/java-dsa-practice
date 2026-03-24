import java.util.Scanner;

public class Patterntriangle {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("  ");
            }
            if(i==1){
                System.out.print(i);

            }
            else if(i!=1){
                int c=i;
                for(int j=1; j<=i; j++){
                    System.out.print(c+" ");
                    c++;
                }
                for(int k=c-2; k>i-1; k--){
                    System.out.print(k+" ");
                }
            }
            System.out.println();
        }

    }
}
