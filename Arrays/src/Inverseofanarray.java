import java.util.Scanner;

public class Inverseofanarray {
    static void main() {
        int[] arr = {0, 2, 4, 1, 3};
        int[] inv = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            inv[arr[i]] = i;
        }

        for (int ele : inv) {
            System.out.print(ele + " ");
        }
    }
}