import java.util.ArrayList;
import java.util.Scanner;

public class kthfactorofn {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(n%i==0){
                ans.add(i);
            }
        }
//        for(int i=0; i<ans.size(); i++){
//            System.out.print(ans.get(i)+" ");
//        }
        System.out.println(ans);
    }
}
