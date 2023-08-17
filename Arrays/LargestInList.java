import java.util.*;

public class LargestInList 
{
    public static int GetLargest(int list[]){
        int Largest=Integer.MIN_VALUE; // - INFINITY
        int Smallest=Integer.MAX_VALUE;
        for(int i=0;i<list.length;i++)
        {
            if(Largest<list[i])
            {
                Largest = list[i];
                
            }
            if(Smallest>list[i]){
                Smallest=list[i];
            }
        }
        System.out.println(Smallest);
        return Largest;
    }
    public static void main(String args[])
    {
        int list[]={1,2,3,6,5};
        System.out.println(GetLargest(list));
    }



}

