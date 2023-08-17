public class PairsInArrays {
    public static void ToGetPairs(int list[])
    {
        int tp=0;
        for(int i=0;i<list.length;i++)
        {
            for(int j=i+1;j<list.length;j++)
            {
                System.out.print("("+list[i]+","+list[j]+")");
                tp++;
                
            }
            
            System.out.println();
        }
        System.out.println(tp);
    }
    public static void main(String args[]){
        int list[]={2,4,6,8,10};
        ToGetPairs(list);
    }
    
}
