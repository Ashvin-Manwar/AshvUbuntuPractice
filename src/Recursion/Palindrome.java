package Recursion;

public class Palindrome {
    static int  rev(int n){
        int digits=(int)(Math.log10(n))+1;
        return  helper(n,digits);
    }
    private static int helper(int n,int digits){
        if (n%10==n){
            return n;
        }
        int rem=n%10;
        return rem*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
    }
    static boolean palin(int n){
        return n==rev(n);
    }
    public static void main(String[] args) {
//        rev1(1234);
//          System.out.println(sum);
//        System.out.println(rev2(1234));

        System.out.println(palin(12321));
    }
}
