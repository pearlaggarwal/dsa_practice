package Array2;

import java.util.Scanner;

public class SearchInRotatedArray {

    static int rotatedarraysearch(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=high-(high-low)/2;
            if(target==nums[mid]){return mid;            
            }
            else if(nums[low]<=nums[mid]){
                if(target>=nums[low] && target<=nums[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(target>=nums[mid] && target<=nums[high]){
                    low=mid+1;
                }
                else {
                    high=mid-1;                
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int target=rotatedarraysearch(nums,m);
        System.out.println(target);
        sc.close();

    }
    
}
