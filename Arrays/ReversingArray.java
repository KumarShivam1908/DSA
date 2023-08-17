public class ReversingArray {
    public static void ToReverse(int list[])
    {
        int start=0; int end=list.length-1;
        while(start<=end)
        {
            int  temp=list[end];
            list[end]=list[start];
            list[start]=temp;
            start++;
            end--;
        }
    }
    public static void main(String args[])
    {
        int list[]={2,3,4,5,6,7,8};
        ToReverse(list);
        for(int i=0;i<list.length;i++)
        {
            System.out.print(list[i]+" ");
        }
    }
    
}
