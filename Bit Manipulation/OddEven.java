public class OddEven {
    public static void OddorEven(int n){
        int BitMask=1;
        if((n & BitMask)==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    public static void main(String args[]){
        int n=12;
        OddorEven(9);
        OddorEven(12);
        OddorEven(0);
        OddorEven(6);
    }
    
}
