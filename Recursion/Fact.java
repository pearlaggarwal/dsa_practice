package Recursion;

public class Fact {
    public static void main(String[] args) {
        int n=5;
        // System.out.println(factorial(n));
        System.out.println(factorial1(n,1));
    }
    //head recursion 
    public static int factorial(int n){
        //base case
        if(n==0){
            return 1;
        }
        int fn=factorial(n-1);
        return fn*n;
    }
    

    //tail recursion
    static int factorial1(int n,int ans){
        if(n==0){
            return ans;
        }
        return factorial1(n-1,ans*n);

    }
    
}
