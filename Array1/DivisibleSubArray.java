package Array1;

import java.util.Scanner;

public class DivisibleSubArray {
    public static long subarraysDivByK(int[] nums, int k) {
        // Brut Force
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum%k==0){
                    count++;
                }
            }
        }
        return count;	
		
    }
    public static void main(String args[]) {
        // Scanner scn=new Scanner(System.in);
        // int t = scn.nextInt(); 
        // while(t-->0){
        //    int n = scn.nextInt(); 
        //    int[] arr=new int[n];
        //    for (int i = 0; i < n; i++) 
        //     arr[i]=scn.nextInt();
        int n=5;
        int[] arr={4,5,0,-2,-3};
        System.out.println(subarraysDivByK(arr, n)); 
        //}
    }
    
}
