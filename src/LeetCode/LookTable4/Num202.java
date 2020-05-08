package LeetCode.LookTable4;

import java.util.HashSet;
import java.util.Set;

public class Num202 {
    public boolean isHappy(int n) {
        Set set =new HashSet();
        while (n!=1&&!set.contains(n)){
            set.add(n);
            int sum=0;
            while(n>0){
                sum=(int)Math.pow(n%10,2)+sum;
                n=n/10;
            }
            n=sum;
        }
        return n==1;

    }
}
