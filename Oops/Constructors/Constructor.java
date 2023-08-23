public class Constructor {
    public static void main(String args[]){
        Student s1=new Student();
        s1.name="Shivam";
        System.out.println(s1.name);
        s1.Roll=99;
        System.out.println(s1.Roll);
        s1.password="abcde";
        s1.marks[0]=90;
        s1.marks[1]=100;
        s1.marks[2]=80;
        Student s2= new Student(s1); //copy done yet when we change value down it gets changed in actual value -->Shallow Copy
        s2.password="xyz";
        s1.marks[2]=100;
        for(int i=0;i<3;i++){
            System.out.print(s2.marks[i]+" ");
        }
        
    }

    
}

class Student{
    String name;
    int Roll;
    String password;
    int marks[];

    //shallow copy constructor s1 properties copied to s2
    // Student(Student s1){
    //     marks=new int[3];
    //     this.name=s1.name;
    //     this.Roll=s1.Roll;
    //     this.marks=s1.marks;
    // }
    //deep copy constructor
    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.Roll=s1.Roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }

    }

    Student(){
        marks=new int[3];
        System.out.println("CONSTRUCTOR IS BEING CALLED");
    }

    Student(String name){
        marks=new int[3];
        this.name=name;
    }

    Student(int Roll){
        marks=new int[3];
        this.Roll=Roll;
    }









}
