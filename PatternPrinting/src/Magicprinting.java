import java.util.Scanner;

public class Magicprinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Upper part
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                for (int j = 1; j <= 2 * n - 1; j++) {
                    System.out.print("*");
                }
            } else {
                for (int k = 1; k <= n - i + 1; k++) {
                    System.out.print("*");
                }
                for (int k = 1; k <= 2 * i - 3; k++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= n - i + 1; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // Lower part
        for (int i = n - 1; i >= 1; i--) {
            if (i == 1) {
                for (int j = 1; j <= 2 * n - 1; j++) {
                    System.out.print("*");
                }
            } else {
                for (int k = 1; k <= n - i + 1; k++) {
                    System.out.print("*");
                }
                for (int k = 1; k <= 2 * i - 3; k++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= n - i + 1; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}