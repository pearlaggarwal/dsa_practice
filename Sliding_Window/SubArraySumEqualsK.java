package Sliding_Window;

public class SubArraySumEqualsK {

    public static void main(String[] args) {
        int[] nums={1,1,1};
        int k=2;
        subarraysum(nums,k);
    }
    public static int subarraysum(int[] nums,int k){
        int si = 0, ei = 0, sum = 0, count = 0;

        while (ei < nums.length) {
            sum += nums[ei];
            while (sum > k && si < ei) {
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
    
}
