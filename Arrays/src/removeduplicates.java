import java.util.Arrays;

public class removeduplicates {
    static void main() {
        int[] arr={1,1,1,2,2,3,3};
        Arrays.sort(arr);
        int i=0;
        for(int j=1; j<arr.length; j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }

    }
}
