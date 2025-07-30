package Array1;

import java.util.Scanner;
import java.util.Arrays;


public class SerenaAndDima {
    // static void serejaDima(int[] nums){
    //     int sereja=0;
    //     int dima=0;
    //     Arrays.sort(nums);
    //     int i=nums.length-1;
    //     while(i>=0){
    //         sereja+=nums[i];
    //         if(i>0){
    //             dima+=nums[i-1];
    //         }            
    //         i=i-2;
    //     }
    //     System.out.println(sereja+" "+dima);
    // }

    static void serejaDima(int[] nums){
        int sereja = 0;
        int dima = 0;
        int left = 0;
        int right = nums.length - 1;
        boolean turn = true; // true = Sereja's turn, false = Dima's

        while(left <= right){
            int chosen;
            if(nums[left] > nums[right]){
                chosen = nums[left++];
            } else {
                chosen = nums[right--];
            }

            if(turn){
                sereja += chosen;
            } else {
                dima += chosen;
            }
            turn = !turn;
        }

        System.out.println(sereja + " " + dima);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }
        serejaDima(nums);
    }


}
