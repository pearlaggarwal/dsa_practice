package SlidingWindow;

import java.util.*;

public class KartikBhaiyAndString {
    public static void main(String[] args) {
        // String str="aabababbaaaaaaabbaa";
        // int k=3;
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        String str=sc.next();
        int flipa=maxlen(str,k,'a');
        int flipb=maxlen(str,k,'b');
        System.out.println(Math.max(flipa,flipb));;
    }
    public static int maxlen(String s, int k, char ch){
        int si=0;
        int ei=0;
        int ans=0;
        int flip=0;
        while(ei<s.length()){
            if(s.charAt(ei)==ch){
                flip++;
            }
            while(flip>k){
                if(s.charAt(si)==ch){
                    flip--;
                }
                si++;
            }
            ans=Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;

    }
    
}
