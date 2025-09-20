package Recursion1;

public class SubSequence {

    public static void main(String[] args) {
        String s="abcd";
        System.out.println(count(s,""));
    }
    static int count(String s,String ans){
        if(s.length()==0){
            return 1;
        }
        int l=count(s.substring(1),ans+s.charAt(0));
        int r=count(s.substring(1),ans);
        return l+r;
    }
    
}
