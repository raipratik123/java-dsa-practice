import java.util.Scanner;

public class Inverseofnumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int pos = 1;
        int inverse = 0;

        while (n > 0) {
            int digit = n % 10;

            // digit position banega, aur pos uski value
            inverse += pos * Math.pow(10, digit - 1);

            n = n / 10;
            pos++;
        }

        System.out.println(inverse);
    }
}
