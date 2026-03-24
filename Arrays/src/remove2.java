public class remove2 {
    static void main() {
        int[] arr={1,1,1,2,2,3,3};
        int n=arr.length;
        for(int i=0; i<n; i++){
            boolean isduplicate=false;
            for(int j=0; j<i; j++){
                if(arr[i]==arr[j]){
                    isduplicate=true;
                    break;
                }
                if(!isduplicate){
                    for(int ele:arr){
                        System.out.println(ele);
                    }

                }
            }
        }

    }
}
