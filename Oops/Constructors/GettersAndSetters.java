public class GettersAndSetters {
    public static void main(String args[]){
        Pen p1=new Pen();
        p1.Setcolor("BLUE");
        System.out.println(p1.Getcolor());
    }
    
}
class Pen
{
    private String color;
    private int tip;

    String Getcolor(){
        return this.color;
    }
    int Gettip(){
        return this.tip;
    }
    
    void Setcolor(String color){
        this.color=color;
    }
    void SetTip(int tip){
        this.tip=tip;
    }

}
