import java.util.Scanner;

public class checkwheatherarrayissortedornot {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                boolean flag = true;
                int n = sc.nextInt();
                int k = sc.nextInt();

                int[] arr = new int[n];

                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }

                if (k >= 2) {
                    System.out.println("YES");
                } else {
                    for (int i = 0; i < n - 1; i++) {
                        if (arr[i] > arr[i + 1]) {
                            flag = false;
                            break;
                        }
                    }
                    if(flag==false) {
                        System.out.println("NO");
                    }
                    else System.out.println("YES");

                }
            }
        }
    }

