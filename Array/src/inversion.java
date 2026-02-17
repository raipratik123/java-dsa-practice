import java.util.*;

public class inversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // input number
        int position = 1;
        int inverted = 0;

        while (n > 0) {
            int digit = n % 10;   // last digit

            // place position at digit's place
            inverted += position * Math.pow(10, digit - 1);

            n = n / 10;   // remove last digit
            position++;   // increase position
        }

        System.out.println(inverted);
    }
}
