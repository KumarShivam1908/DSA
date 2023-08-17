import java.util.*;
public class ToFindAElementIn2dArray {
    public static boolean Tocheck(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.print("The key is found at i ="+i+"and j= "+j);
                    return true;

                }

            }
        }
        return false;
    }




    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[3][3];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        //Toprint (2-d)array
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
            
        }

        Tocheck(matrix, 5);
    }
    
}
