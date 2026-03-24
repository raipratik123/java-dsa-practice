public class Stringcompression {
    static void main() {
        String s="aaaabbbddddeeeeff";
        char[] ch=s.toCharArray();
        String ans="";
        int i=0; int j=0;
        while(j<ch.length){
            if(ch[i]==ch[j]) j++;
            else{
                ans+=ch[i];
                int len=j-i;
                if(len>1) ans+=len;
                i=j;

            }
        }
        ans+=ch[i];
        int len=j-i;
        if(len>1) ans+=len;
        System.out.println(ans);
    }
}
