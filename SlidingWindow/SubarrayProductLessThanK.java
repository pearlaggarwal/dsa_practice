package SlidingWindow;

public class SubarrayProductLessThanK {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,2};
        int k=10;
    }
    public static int Product_less_than_k(int[] arr,int k){
        int si=0;
        int ei=0;
        int p=1;
        int ans=0;
        while(ei<arr.length){
            //growing
            p=p*arr[ei];
            //shrink
            while(p>=k && si<=ei){
                p=p/arr[si];
                si++;
            }
            //calculate
            ans=ans+(ei-si+1);
            ei++;
        }
        return ans;
    }
}
