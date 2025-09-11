package Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int arr[] ={0,1,0,2,1,0,1,3,2,1,2,1};
        // int[] arr={5,3,1,2,7,4,1,6};
        int sum=trapping(arr);
        System.out.println(sum);
    }
    public static int trapping(int[] arr){
        int[] left=ngel(arr);
        int[] right=nger(arr);
        int sum=0;
        for(int i=0;i<right.length;i++){
            sum=sum+Math.min(left[i],right[i])-arr[i];
        }
        return sum;
    }
    public static int[] ngel(int[] arr){
        int[] left=new int[arr.length];
        left[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }
        return left;
    }

    public static int[] nger(int[] arr) {
        int[] right=new int[arr.length];
        right[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            right[i]=Math.max(right[i+1],arr[i]);
        }
        return right;
        
    }
}
