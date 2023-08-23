public class MakingClasses
{
    public static void main(String args[]){
        Pen p1=new Pen();
        p1.Setcolor("Yellow");
        System.out.println(p1.color);

    }
    
}
class Pen{
    String color;
    int tip;
    
    void Setcolor(String newcolor){
        color=newcolor;
    }
    void SetTip(int newtip){
        tip=newtip;
    }
}
