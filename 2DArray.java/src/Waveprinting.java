import java.util.Scanner;

public class Waveprinting {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int[][] arr={{1,2,3},{5,6,7},{9,10,11},{13,14,15}};
        int m=arr.length;
        int n=arr[0].length;
        for(int i=0; i<m; i++){
            if(i%2==0){
                int j=0;
                while(j<n){
                    System.out.print(arr[i][j]+" ");
                    j++;
                }
            }
            else{
                int j=n-1;
                while(j>=0){
                    System.out.print(arr[i][j]+" ");
                    j--;
                }
            }
        }
    }

}
