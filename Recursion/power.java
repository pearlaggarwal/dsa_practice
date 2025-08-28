package Recursion;

public class power {
    static int Power(int a,int b){
        if (b==0)
            return 1;
        int x=Power(a, b-1)*a;
        return x;
    }
    public static void main(String[] args) {
        int n=3;
        int m=4;
        System.out.println(Power(n, m));
    }
}
