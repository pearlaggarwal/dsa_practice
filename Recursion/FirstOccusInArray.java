package Recursion;

public class FirstOccusInArray {
    public static void main(String[] args) {
        int[] n={2,4,3,3,5,6,4,7};
        int item=9;
        System.out.println(firstoccur(n,item,0));
    }
    static int firstoccur(int[] arr,int item,int idx){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==item){
            return idx;
        }
        return firstoccur(arr, item, idx+1);

    }
}
