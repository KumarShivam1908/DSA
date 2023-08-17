import java.util.*;

public class BinarySearch {
    public static int ToBinarySearch(int list[],int key)
    {
        int start=0;
        int end=list.length;
        while(start<=end)
        {
            int mid=(start+end)/2;

            //comparisons
            if(list[mid]==key){         //found condition
                return mid;
            }
            if(list[mid]>key){
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }

        }
        return -1;
    }
    public static void main(String args[]){
        int list[]={2,4,6,8,10,12};
        int key=3;
        System.out.println("Index for key is"+ToBinarySearch(list, key));
    }
    
}
