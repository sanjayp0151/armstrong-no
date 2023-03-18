package Armstrong;
import java.lang.Math;

public class Arm {
      public static void main(String[] args) {
            System.out.println(armstrongNumber(153));
      }
      public static String armstrongNumber(int n){
            int no = n,ar=n%10;
            int ans =0;
            while(n!=0){
                int rem = n%10;
                n/=10;
                ans=ans+(int)Math.pow(rem,ar);
            }
            if(ans==no)
                return "Yes";
            else return "No";
        }
}
