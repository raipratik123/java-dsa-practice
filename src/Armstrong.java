import static java.lang.Math.pow;

public class Armstrong {
    static void main() {
        int n=133;
        int len=0;//cube of each digit and sum
            int temp=n;
            while(temp!=0){
                temp=temp/10;
                len++;
            }
            temp=n;
            double sum=0;
            while(temp!=0){;
                int k=temp%10;
                sum=sum+pow(k,len);
                temp=temp/10;
            }

          if(n==sum){
              System.out.println("yes armstrong");
          }
          else{
              System.out.println("not");
          }


        }

        }


