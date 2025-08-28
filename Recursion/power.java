package Recursion;

public class power {
    static int power(int a,int b){
        if (b==0)
            return 1;
        int x=power(a, b-1)*a;
        return x;
    }
    public static void main(String[] args) {
        int n=3;
        int m=4;
        System.out.println(power(n, m));
    }
}
