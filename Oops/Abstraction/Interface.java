public class Interface {
    public static void main(String args[]){
        Queen q=new Queen();
        q.Moves();

    }
    
}
interface Chess{
    void Moves();
}
class Queen implements Chess{
    public void Moves(){
        System.out.println("moves left,right,up,down,diagnol in all directions");
    }
}

class Rook implements Chess{
    public void Moves(){
        System.out.println("moves up, dowm , left , right");
    }
}

class King implements Chess{
    public void Moves(){
        System.out.println("Moves right, left , up , down , diagonal but only 1 step");
    }
}