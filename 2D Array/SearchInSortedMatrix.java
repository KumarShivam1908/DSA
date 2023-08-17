public class SearchInSortedMatrix {
    public static Boolean StaircaseSearch(int list[][],int key)
    {
        int row=0;
        int col=list[0].length-1;
        while(row<list.length && col>=0)
        {
            if(list[row][col]==key)
            {
                System.out.println("Key found at"+row+"and column"+col);
                return true;
            }
            else if(key<list[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Not found");
        return false;
    }
    public static void main(String args[]){
        //BruteForce will give O(N^2) so no need to use it.
        int key=33;
        int list[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        StaircaseSearch(list, key);

    }
    
}
