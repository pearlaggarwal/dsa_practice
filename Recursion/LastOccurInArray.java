package Recursion;

public class LastOccurInArray {
    public static void main(String[] args) {
        int[] n = {2, 4, 3, 3, 5, 6, 4,3, 7};
        int item = 3;
        System.out.println(lastOccur(n, item, 0));
    }
    static int lastOccur(int[] arr, int item, int idx) {
        if (idx == arr.length) {
            return -1; 
        }
        int restAns = lastOccur(arr, item, idx + 1);
        if (restAns != -1) {
            return restAns;
        }
        if (arr[idx] == item) {
            return idx;
        }
        return -1;
    }
}
