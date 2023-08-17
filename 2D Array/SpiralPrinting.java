public class SpiralPrinting
{

    public static void ToprintSpiral(int matrix[][])
    {
        int Startrow=0;
        int Startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;
        while(Startrow<=endrow && Startcol<=endcol)
        {
            //top
            for(int j=Startcol;j<=endcol;j++)
            {
                System.out.print(matrix[Startrow][j]+" ");
            }
            //right
            for(int i=Startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcol]+" ");
            }
            //bottom
            for(int j=endcol-1;j>=Startcol;j--){
                if(Startcol==endcol){
                    break;
                }
                System.out.print(matrix[endrow][j]+" ");
            }
            //left
            for(int i=endrow-1;i>=Startrow+1;i--){
                if(Startrow==endrow){
                    break;
                }
                System.out.print(matrix[i][Startcol]+" ");
            }
            Startrow++;
            Startcol++;
            endcol--;
            endrow--;
        }
    }
    public static void main(String args[])
    {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        ToprintSpiral(matrix);
    }
    
}

 
