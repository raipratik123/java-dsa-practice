public class NextPermutation {
    public static void swap(int[] arr,int i, int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }
    public  static void swap2(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void main() {
        int[] arr={1,2,3};
        int n= arr.length;

        int idx=-1;
        for(int i=n-2; i>=0; i--){
            if(arr[i]<arr[i+1]){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            swap(arr, 0,n-1);
            for(int ele:arr){
                System.out.print(ele+"");
            }
            return;
        }
        int secondidx=0;

        for(int i=n-1; i>idx; i--){
            if(arr[i]>arr[idx]){
                secondidx=i;
            }
        }
        swap2(arr,idx,secondidx);
        swap(arr,idx+1,n-1);
        for(int ele:arr){
            System.out.print(ele);
        }
    }
}
