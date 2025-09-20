package Recursion;

public class Print_Increasing {
    public static void main(String[] args) {
        int n=5;
        print_inc(n);
    }
    public static void print_inc(int n){
        if(n==0){
            return;
        }
        print_inc(n-1);
        System.out.println(n);
    }
}
