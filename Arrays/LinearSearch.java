import java.util.*;

public class LinearSearch {
    public static int ToLinearSearch(int numbers[],int a)
    {
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==a){
                return i;
            }

        }
        return -1;

    }
    public static void main(String args[]){
        int numbers[]={1,2,3,4,5,6,7,8,9,12};
        int a=5;
        int IndexValue = ToLinearSearch(numbers, a);
        System.out.print("THE INDEX VALUE IS"+IndexValue);
        
    }
    
}
