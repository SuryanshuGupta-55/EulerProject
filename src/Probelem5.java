import java.util.*;
class Probelem5{
    public static long gcd(long a,long b){
        if(b==0)
            return a;
        else
            return(gcd(b,a%b));
    }
    public static long lcm(int n){
        long ans = 1;
        for(int i=1;i<=n;i++){
            ans = (ans*i)/gcd(ans,i);
        }
        return ans;
    }
    public static void main(String[] args){
        int n = 20;
        System.out.println(lcm(n));
    }

}