package Array1;

public class RainwaterTaping {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int result = trap(height);
        System.out.println(result);
    }

    static int trap(int[] height) {
        int totalwater=0;
  
        int[] NGEL=ngel(height);
        int[] NGER=nger(height);
        for(int i=0;i<height.length;i++){
            int currwater=0;
            
            int waterlevel=0;
            currwater=Math.min(NGEL[i],NGER[i]);
            waterlevel=currwater-height[i];
            if(waterlevel>0){
                totalwater+=waterlevel;
            }
        }
        return totalwater;

    }
    static int[] nger(int[] arr){
        int maxelement=0;
        int[] nger=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            nger[i]=maxelement;
            maxelement=Math.max(arr[i],maxelement);       

        }
        return nger;
    }
    static int[] ngel(int[] arr){
        int maxelement=0;
        int[] ngel=new int[arr.length];
        for(int i=0;i<=arr.length-1;i++){
            ngel[i]=maxelement;
            maxelement=Math.max(arr[i],maxelement);      
        }
        return ngel;
    }
}