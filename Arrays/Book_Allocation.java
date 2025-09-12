package Arrays;

import java.util.Scanner;

public class Book_Allocation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] books=new int[n];
            for(int i=0;i<books.length;i++){
                books[i]=sc.nextInt();
            }
            System.out.println(booksallocate(books,n,m));
        }
        sc.close();
    }
    public static int booksallocate(int[] books,int n,int m){
        if(m>n) return -1;

        int lo = books[0];
        for (int i = 1; i < n; i++) {
            if (books[i] > lo) {
                lo = books[i];
            }
        }
        int hi = 0;
        for (int i = 0; i < n; i++) {
            hi += books[i];
        }
        int ans=hi;
        while(lo<hi){
            int mid=(lo+hi)/2;

            if(ispossible(books,n,m,mid)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }

    public static boolean ispossible(int[] books , int n , int m , int mid){
        int student=1;
        int page=0;
        for(int i=0;i<n;i++){
            if(page+books[i]>mid){
                student++;
                page=books[i];
                if(student>m) return false;
            }else{
                page+=books[i];
            }
        }
        return true;
    }
}
