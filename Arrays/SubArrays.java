public class SubArrays {
    public static void GetSubArrays(int list[])
    {
        int ts=0;
        for(int start=0;start<list.length;start++)  //start taken
        {
            for(int end=start;end<list.length;end++)  //end taken
            {
                for(int k=start;k<=end;k++) //start to end printed
                {
                    System.out.print(list[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();    
        }
        System.out.println("Total subArray is"+ts);
    }
    public static void main(String args[]){
        int list[]={2,4,6,8,10};
        GetSubArrays(list);
     

    }
    
}
