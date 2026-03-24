import com.sun.jdi.IntegerValue;

public class Selectionsort {
    static void main() {
        int[] arr={5,4,3,2,1};
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            int mn= Integer.MAX_VALUE;
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
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
