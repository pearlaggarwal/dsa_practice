package Recursion;

public class Factorial{
    static int fact(int n){
        if(n==0||n==1)
            return 1;
        int x=n*fact(n-1);
        return x;
    }
    public static void main(String[] args) {
        int n=3;
        int m=4;
        int x=1;
        System.out.println(fact(n));
    }

}