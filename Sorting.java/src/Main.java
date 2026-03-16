import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int count=0;

            int n = sc.nextInt();
            int[] arr= new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int i=0;
            while(i<arr.length){
                if(arr[i]==2){
                    count++;
                }
                i++;
            }
            if(count%2!=0){
                System.out.println("-1");
                continue;
            } else if (count==0) {
                System.out.println("1");
                continue;

            }
            int need = count / 2;
            int two = 0;

            for(int j = 0; j < n; j++){
                if(arr[j] == 2){
                    two++;
                }

                if(two == need){
                    System.out.println(j + 1);
                    break;
                }
            }

        }

    }
}
