public class even {
    static void main() {
        String s="Physics Wallah Skills";
        String ans="";
        for(int i=0; i<s.length(); i++){
//            char ch=s.charAt(i);
            if(i%2==0){
                ans+='a';
            }
            else{
                ans+=s.charAt(i);
            }

        }
        System.out.println(ans);
    }
}
