package Sliding_Window;

public class SubarrayProductLessThanK{
    public static void main(String[] args) {
        int[] nums={10,5,2,6};
        int k=100;
        subarrayproduct(nums,k);
    }
    static int subarrayproduct(int[] nums,int k){
        int si=0;
        int ei=0;
        int p=1;
        int ans=0;
        while(ei<nums.length){
            //growing
            p=p*nums[ei];
            //shrink
            while(p>=k && si<=ei){
                p=p/nums[si];
                si++;
            }
            //calculate
            ans=ans+(ei-si+1);
            ei++;
        }
        return ans;
    }
}