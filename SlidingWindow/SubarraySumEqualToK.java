package SlidingWindow;

public class SubarraySumEqualToK {
    public static void subarraySum(int[] nums, int k) {
        int si = 0, ei = 0, sum = 0, count = 0;
        System.out.println(count);
        while (ei < nums.length) {
            sum += nums[ei];
            while (sum > k && si <= ei) {
                sum -= nums[si];
                si++;
            }
            if (sum == k) {
                count++;
            }
            ei++;
        }
        System.out.println(count);
        //return count;
    }
    public static void main(String[] args) {
        int[] nums={1};
        int k=0;
        subarraySum(nums,k);
        //System.out.println(ans);        
    }
}
