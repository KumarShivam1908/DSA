import java.util.*;
public class Creation {
    public static void main(String args[]){
        int matrix[][]=new int[3][4];

        Scanner sc=new Scanner(System.in);
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        //toprint matrix
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }





    }

    
}
