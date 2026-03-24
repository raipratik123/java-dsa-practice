import java.util.Scanner;

public class countvowels {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='a'){
                count++;
            }
            else if(str.charAt(i)=='e') count++;
            else if(str.charAt(i)=='i') count++;
            else if(str.charAt(i)=='o') count++;
            else if (str.charAt(i)=='u') {
                count++;

            }

        }
        System.out.println(count);
    }
}
