package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Moving_Points {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] x=new int[n];
        int[] v=new int[n];
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
            v[i]=sc.nextInt();
        }
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                ans+=min_distance(x[i],v[i],x[j],v[j]);
            }
        }
        System.out.println(ans);
    }
    public static int min_distance(int xi,int vi,int xj,int vj){

        double t=(double)(xj-xi)/(vi-vj);
        if(t>=0){
            return 0;
        }
        else{
            return Math.abs(xi-xj);
        }
    }
}
