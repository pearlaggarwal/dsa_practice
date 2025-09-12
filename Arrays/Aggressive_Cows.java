package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_Cows {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=sc.nextInt();
        int[] stall=new int[n];
        for(int i=0;i<stall.length;i++){
            stall[i]=sc.nextInt();
        }
        Arrays.sort(stall);
        System.out.println(largest_minimum_distance(stall, c));
    }
    public static int largest_minimum_distance(int[] stall,int c) {
        int lo=0;
        int hi=stall[stall.length-1]-stall[0];
        int ans=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(ispossible(stall,c,mid)==true){
                ans=mid;
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        return ans;        
    }
    public static boolean ispossible(int[] stall,int c,int mid){
        int cow=1;
        int pos=stall[0];
        for(int i=1;i<stall.length;i++){
            if(stall[i]-pos>=mid){
                cow++;
                pos=stall[i];
            }
            if(cow==c){
                return true;
            }
        }
        return false;
    }
}
