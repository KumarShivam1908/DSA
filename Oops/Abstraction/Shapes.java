public class Shapes {
    public static void main(String args[]){
        Circle c=new Circle();
        Rectangle r=new Rectangle();
        c.todraw();
        r.todraw();

    }
    
}
abstract class Shapess{
    abstract void todraw();
}

class Circle extends Shapes{
    void todraw(){
        System.out.println("it is a circle");
    }
}

class Rectangle extends Shapess{
    void todraw(){
        System.out.println("it is a rectange");
    }
}
