package Recursion;

public class Nto1 {
    public static void main(String[] args) {
//        fun(5);
//        funRev(5);
        funBoth(5);
        }
//    concept
        static void concept(int n){
        if (n==0){
            return;
        }
      System.out.println(n);
        concept(--n);
    }
    static void funRev(int n){
        if (n==0){
            return;
        }
        funRev(n-1);
        System.out.println(n);
    }
    static void fun(int n){// decreasing no printing ie decending order
        if (n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    static void funBoth(int n){
        if (n==0){
            return;
        }
        System.out.print(n+" ");
        funBoth(n-1);
        System.out.print(n+" ");
    }

}
