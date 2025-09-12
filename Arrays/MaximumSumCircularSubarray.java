package Arrays;

public class MaximumSumCircularSubarray {
    public static void main(String[] args) {
        int[] arr={5,-3,5};
        System.out.println(MaximumSubarraysum(arr));
    }
    public static int MaximumSubarraysum(int[] nums) {
        int currMin = 0, currMax = 0;
        int maxSum = nums[0], minSum = nums[0];
        int totalSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currMax = Math.max(nums[i], currMax + nums[i]);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(nums[i], currMin + nums[i]);
            minSum = Math.min(minSum, currMin);

            totalSum += nums[i];
        }

        if (minSum == totalSum) return maxSum; 
        return Math.max(maxSum, totalSum - minSum);
    }
}
