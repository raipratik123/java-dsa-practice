public class findthemaxima {
    static void main() {
     int[] arr={20,30,-40,60,100};
     int mx=Integer.MIN_VALUE;

     for(int i=0; i<arr.length; i++){
         if(arr[i]>mx){
             mx=arr[i];
         }
     }
        System.out.println(mx);
    }
}
