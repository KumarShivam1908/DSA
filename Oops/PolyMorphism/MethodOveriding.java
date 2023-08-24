public class MethodOveriding {
    public static void main(String args[]){
        Deer d= new Deer();
        d.eats();

    }
    
}

class Animals{
    void eats(){
        System.out.println("eats");
    }
}
class Deer extends Animals{
    void eats(){
        System.out.println("it eats grass");
    }
}