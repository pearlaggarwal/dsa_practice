package Array3;
import java.util.Scanner;

public class DaytAtTheBeach {

    static int dat_at_beach(int[] nums){
        int[] right=new int[nums.length];
        int n=nums.length;
        right[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.min(nums[i],right[i+1]);
        }
        int maxele= 0;
        int count=0;
        for(int i=0;i<n-1;i++){
            maxele=Math.max(maxele,nums[i]);
            if(maxele<=right[i+1]){
                count++;
            }
        }
        return count+1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(dat_at_beach(arr));
    }
    
}
