package Recursion1;

public class Fibo {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fibonacci(n));
    }
    static int fibonacci(int n){
        if(n==0||n==1){
            return n;
        }
        int f1=fibonacci(n-1);
        int f2=fibonacci(n-2);
        return f1+f2;
    }
    
}
