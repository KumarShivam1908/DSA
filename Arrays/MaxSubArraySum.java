public class MaxSubArraySum {
    public static void GetMaxSum(int list[]){
        int maxsum=Integer.MIN_VALUE;             //-infinity 
        int currsum=0; 
        for(int i=0;i<list.length;i++){
            for(int j=i;j<list.length;j++){
                currsum=0;
                for(int k=i;k<=j;k++){
                    currsum=currsum+list[k];
                }
                if(currsum>maxsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("MaxSum is"+maxsum);
    }
    public static void main(String args[]){
        int list[]={1,-2,6,-1,3};
        GetMaxSum(list);
    }
    
}
