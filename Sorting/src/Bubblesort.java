public class Bubblesort {
    static void main() {
        int[] arr={5,6,7,8,2,1};
//        int[] ans=new int[arr.length];
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }

        }
     for(int i=0; i<arr.length; i++){
         System.out.print(arr[i]+" ");
     }
    }

}
