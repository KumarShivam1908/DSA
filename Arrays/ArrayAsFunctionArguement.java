import java.util.*;

public class ArrayAsFunctionArguement {
    public static void Update(int marks[],int Nonchange)
    {
        Nonchange=8;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String args[])
    {
        int marks[]={97,98,99};
        int Nonchange=6;
        System.out.println(Nonchange); //this value didnt get changed even after update

        Update(marks,Nonchange);  //But array got changed after passing the parameter in the function, this is how we can call array by reference
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
            
        }


    }
    
}
