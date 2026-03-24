import java.util.Arrays;

public class Sorting {
    static void main() {
        String str="pratik";
        char[] ch=str.toCharArray();
        Arrays.sort(ch);
        for(char ele:ch){
            System.out.print(ele);
        }
        //agr sb ko sort krna hai toh phale sting me cahnge karn padega uske baad array ke ander then hoga
    }
}
