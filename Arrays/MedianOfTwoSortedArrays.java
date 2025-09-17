package Arrays;

import java.util.*;
public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        // int[] nums1={1,3};
        // int[] nums2={2};
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[] nums1=new int[m];
        int[] nums2=new int[n];
        for(int i=0;i<m;i++){
            nums1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            nums2[i]=sc.nextInt();
        }
        System.out.println(findmedian(nums1,nums2));
    }
    static double findmedian(int[] nums1,int[] nums2){
        int m=nums1.length;
        int n=nums2.length;
        int[] merged=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(nums1[i] < nums2[j]){
                merged[k++]=nums1[i++];
            }
            else{
                merged[k++]=nums2[j++];
            }
        }
        while(i<m){
            merged[k++]=nums1[i++];

        }
        while(j<n){
            merged[k++]=nums2[j++];
        }
        int total=m+n;
        if(total%2==1){
            return merged[total/2];
        }
        else{
            return (merged[total / 2 - 1] + merged[total / 2]) / 2.0;
        }
    }
    
}
