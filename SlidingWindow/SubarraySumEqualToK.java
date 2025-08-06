package SlidingWindow;

public class SubarraySumEqualToK {
    public static int subarraySum(int[] nums, int k) {
        int si = 0, ei = 0, sum = 0, count = 0;

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

        return count;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3};
        int k=3;
        int ans=subarraySum(nums,k);
        System.out.println(ans);
        
    }
}
