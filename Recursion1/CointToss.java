package Recursion1;

public class CointToss {

    static void toss(int n,String ans){
        if(n==0){
            System.out.print(ans+" ");
            return;
        }
        toss(n-1, ans+"H");
        toss(n-1, ans+"T");    
    }
    public static void main(String[] args) {
        toss(1,"");
    }

    
}
