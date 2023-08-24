public class Inher {
    public static void main(String args[]){
       Dogs Tuffy = new Dogs();
       Tuffy.eats();
       Tuffy.legs=5;
       System.out.println(Tuffy.legs);

    }
}
class Animals{
    String color;

    void eats () {
        System.out.println("yes it eats");
    }

    void Breathe () {
        System.out.println("Yes it breathe");
    }
}

class Fish extends Animals{
    int fins;
   
    void Danger(){
        System.out.println("Yes it is dangerous");
    }
}

class Mammals extends Animals{
    int legs;
}

class Dogs extends Mammals{
    String breed;
}
  