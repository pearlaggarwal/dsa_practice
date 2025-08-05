package Arrayspractice;

import java.util.Scanner;

public class MaximumProductSubarray {

    static int MaximumPrduct(int[] nums){
        int currproduct=1;
        int maxproduct=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            currproduct*=nums[i];
            maxproduct=Math.max(maxproduct,currproduct);
            if(currproduct==0){
                currproduct=1;
            }
        }
        currproduct=1;
        for(int i=nums.length-1;i>=0;i--){
            currproduct*=nums[i];
            maxproduct=Math.max(maxproduct,currproduct);
            if(currproduct==0){
                currproduct=1;
            }
        }
        return maxproduct;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(MaximumPrduct(arr));

    }
}
