public class Secondmaxima {
    static void main() {
        int[] arr={20,30,60,70,100};
        int mx=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        int secondmaxima=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=mx){
                secondmaxima=Math.max(arr[i],secondmaxima);
            }

        }
        System.out.println(secondmaxima);
    }

}
