package Recursion;

public class Print_Decreasing {

    public static void main(String[] args) {
        int n=5;
        print_dec(n);

    }
    
    static void print_dec(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print_dec(n-1);

    }
}
