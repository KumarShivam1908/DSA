public class Swapping {
    public static void Swap(int a, int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a is:"+a+"and b is:"+b);
    }
    public static void main(String args[]){
        int a=5;
        int b=6;
        Swap(a,b);
    }
    
}
