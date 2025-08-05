package Array1;

import java.util.Scanner;

public class ProductOfArrayExceptSelf {
    // approach 1
    static void productarray(int[] nums){
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count=1;
            for(int j=0;j<nums.length;j++){
                if(i==j) continue;
                count*=nums[j];

            }
            ans[i]=count;
        }
    }
    //approach 2
    public int[] productExceptSelf(int[] nums) {
        int pre[]=new int[nums.length];
        int suff[]=new int[nums.length];
        pre[0]=1;
        suff[nums.length-1]=1;
        for(int i=1;i<nums.length;i++){
            pre[i]=pre[i-1]*nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            suff[i]=suff[i+1]*nums[i+1];
        }
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=pre[i]*suff[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        productarray(nums);
        sc.close();
    }
    
}
