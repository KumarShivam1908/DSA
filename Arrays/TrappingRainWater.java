public class TrappingRainWater {
    public static int TrappedRainwater(int height[]){
        // leftmax
        int leftmax[]=new int[height.length];
        leftmax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }

        //rightmax
        int rightmax[]=new int[height.length];
        rightmax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        int trappedRainwater=0;
        //loop
        for(int i=0;i<height.length;i++){
            //min(leftmax,rightmax)
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            //trapped water =(waterlevel-height)*1
            trappedRainwater+=(waterlevel-height[i])*1;
        }
        return trappedRainwater;
        
        
    }
    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        System.out.println("The trapped Rainwater is "+TrappedRainwater(height));
    }
    
}
