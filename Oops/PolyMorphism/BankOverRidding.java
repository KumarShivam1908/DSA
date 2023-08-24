public class BankOverRidding {
    public static void main(String args[]){
        Bank b=new Bank();
        SBI s=new SBI();
        ICIC i=new ICIC();
        Axis a=new Axis();

        System.out.println("The rate of interest of sbi is:"+s.GetRate());
        System.out.println("The rate of interest of ICIC is:"+i.GetRate());
        System.out.println("The rate of interest of Axis is"+a.GetRate());

    }
    
}

class Bank{
    int GetRate(){
        return 0;
    }
}
class SBI extends Bank{
    int GetRate(){
        return 7;
    }
}
class ICIC extends Bank{
    int GetRate(){
        return 9;
    }
}

class Axis extends Bank{
    int GetRate(){
        return 8;
    }
}
