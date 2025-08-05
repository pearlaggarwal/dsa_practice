// LC 121
package Arrayspractice;
import java.util.Scanner;
public class BestTimeToButAndSellStock {
    static int buyandsell(int[] prices){
        int buy=prices[0];
        int currprofit=0;
        int maxprofit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            else{
                currprofit=prices[i]-buy;
                maxprofit=Math.max(maxprofit,currprofit);
                
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        buyandsell(arr);
    }
}
