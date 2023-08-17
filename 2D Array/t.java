public class t {
    public staic int ToCalc(int l[][]){
        int sum=0;
        for(int i=0;i<l.length;i++){
            for(int j=0;j<l[0].length;j++){
                if(i==j){
                    sum+=l[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int l[][]={{1,2,3},{4,5,6},{7,8,9}};
        ToCalc(l[][]);
    }
    
}
