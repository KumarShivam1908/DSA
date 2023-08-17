public class PrefixSumApproach{
    
    public static void GetMaxSum(int list[]){
        int max=Integer.MIN_VALUE;
        int curr=0;
        int prefix[]=new int[list.length];
        prefix[0]=list[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+list[i];
        }
        for(int i=0;i<list.length;i++){
            int start=i;
            for(int j=0;j<list.length;j++){
                int end=j;
                curr=start==0 ? prefix[end] : prefix[end]-prefix[start-1];

            }
            if(curr>max){
                max=curr;
            }

        }
        System.out.println("Max Sum is : "+max);



    }
    public static void main(String args[]){
        int list[]={1,-2,6,-1,3};
        GetMaxSum(list);
    }
}
