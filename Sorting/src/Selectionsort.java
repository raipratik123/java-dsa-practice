import java.util.Scanner;

public class Selectionsort {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0; i< arr.length; i++){
            int mn=Integer.MAX_VALUE;
            int mindx=-1;
            for(int j=i; j<n; j++){
                if(arr[j]<mn){
                    mn=arr[j];
                    mindx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[mindx];
            arr[mindx]=temp;
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
