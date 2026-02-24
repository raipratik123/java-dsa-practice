public class Mergesort {
    static void main() {
        int[] arr={1,2};
        int[] arr2={3,4};
        int n=arr.length;
        int m= arr2.length;
        int[] ans=new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(arr[i]<=arr2[j]){
                ans[k++]=arr[i];
                i++;
            }
            else{
                ans[k++]=arr2[j];
                j++;
            }
        }
        if(i==n){
            while(j<m){
                ans[k++]=arr2[j];
                j++;
            }
        }
        else {
            while (i<n){
                ans[k++]=arr[i];
                i++;
            }
        }
        for (int p=0; p<ans.length; p++ ){
            System.out.print(ans[p]+" ");
        }
    }
}
