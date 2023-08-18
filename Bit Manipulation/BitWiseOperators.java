public class BitWiseOperators {
    public static int AndOperator(int a, int b){
        return a&b;   //and
    }

    public static int OrOperator(int a, int b){
        return a|b;  //or or
    }

    public static int BinaryXor(int a, int b){
        return a^b;
    }
    
    public static int Compliment(int a){
        return ~a;
    }
    public static int LeftShit(int a){
        return a<<2;
    }
    public static int RightShift(int a){
        return a>>2;
    }
    public static void CheckOddEven(int a){
        if((a&1)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }

    public static int GetIthBit(int a, int i){
        int Bitmask=1<<i;
       if((a&Bitmask)==0){
        return 0;
       }
       return 1;
    }

    public static int SetIthBit(int a,int i){
        return a|(1<<i);
    }
    
    public static int ClearIthBit(int a,int i){
        return a&(~(1<<i));
    }
    public static int UpdateithBit(int a, int newbit,int i){
        if(newbit==0){
            return ClearIthBit(a,i);
        }
        else{
            return SetIthBit(a, i);
        }
    }

    public static int ClearLastIbits(int a,int i){
        return a&(-1<<i);
    }

    public static int ClearLastIbits(int a, int i, int j){
        int m=(~0)<<(j+1);
        int n=(1<<i)-1;
        return m|n;
    }
    public static void main(String args[]){
        int a=7;
        int b=6;
        // System.out.println(AndOperator(a, b));
        // System.out.println(OrOperator(a, b));
        // System.out.println(BinaryXor(a, b));
        // System.out.println(Compliment(a));
        // System.out.println(LeftShit(a));
        // System.out.println(RightShift(a));
        // CheckOddEven(b);
        //System.out.println(UpdateithBit(a, 1, 3));
        System.out.println(ClearIthBit(a,1));
        System.out.println(ClearLastIbits(a,2,7));
    }
    
}
