package Array3;

import java.util.Scanner;

public class PartitionArrayIntoDisjointInterval {
    static int partitionDisjoint(int[] nums) {
        int[] right=new int[nums.length];
        int n=nums.length;
        right[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.min(nums[i],right[i+1]);
        }
        int leftmax= 0;
        for(int i=0;i<n;i++){
            leftmax=Math.max(leftmax,nums[i]);
            if(leftmax<=right[i+1]){
                return i+1;
            }
        }
        return 0;   
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        partitionDisjoint(nums);
        sc.close();
    }
    
}
