package SlidingWindow;

import java.util.Scanner;

public class MonuBhaiyaAndScore {
    public static void main(String[] args) {
        // int[] nums={2,1,4};
        // int k=10;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        numberofsubarray(nums,k);
        sc.close();
    }
    public static void numberofsubarray(int[] nums,int k){
        int si=0;
        int ei=0;
        int sum=0;
        int ans=0;
        int count=0;
        int l=0;
        while(ei<nums.length){
            l=(ei-si)+1;
            sum+=nums[ei];
            ans=l*sum;
            while(ans>=k && si<=ei){
                sum-=nums[si];
                si++;
                l=(ei-si)+1;
                ans=l*sum;
            }
            count += (ei - si + 1);
            ei++;
        }
        System.out.println(count);
    }    
}
