public class KadaneAlgo {
    public static void Kadanes(int list[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<list.length;i++){
            cs=cs+list[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("The maximum sum using Kadane algorithm is "+ ms);
    }
    public static void main(String args[])
    {
        int list[]={-2,-3,4,-1,-2,1,5,-3};
        Kadanes(list);
    }
}
