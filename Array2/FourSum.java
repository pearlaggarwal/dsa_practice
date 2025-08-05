package Array2;
import java.util.*;
public class Foursum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);       

        for(int i=0;i<nums.length-3;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                int left=j+1;
                int right=nums.length-1;

                while(left<right){
                    long sum=(long) nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        while(left<right && nums[left]==nums[left+1]){
                            left++;
                        }
                        while(left<right && nums[right]==nums[right-1]){
                            right--;
                        }
                        left++;
                        right--;
                    }
                    else if(sum<target){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        // int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        Foursum fs = new Foursum();
        List<List<Integer>> result = fs.fourSum(nums, target);
        for(List<Integer> list : result){
            System.out.println(list);
        }
        sc.close();

    }
}