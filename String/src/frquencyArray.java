import java.util.Scanner;

public class frquencyArray {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int[] freq=new int[26];
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            int idx=(int)ch-97;
            freq[idx]++;
        }
        int maxfreq=-1;
        for(int i=0; i<s.length(); i++){
            maxfreq=Math.max(maxfreq,freq[i]);
        }
        for(int i =0; i<s.length(); i++){
            if(freq[i]==maxfreq){
                char ch=(char)(i+97);
                System.out.print(ch);
            }
        }
    }
}
