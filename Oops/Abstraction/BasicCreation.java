public class BasicCreation 
{
    public static void main(String args[]){
        Horse h= new Horse();
        Chicken c=new Chicken();
        h.walk();
        c.walk();


    }
    
}

abstract class Animals
{
    void eats()
    {
        System.out.println("it eats");
    }
    abstract void walk();
    
}
class Horse extends Animals
{
    void walk(){
        System.out.println("It walks on 4 legs");
    }
}
class Chicken extends Animals{
    void walk(){
        System.out.println("it was on 2 legs");
    }
}

