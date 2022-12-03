package Oops;

public class UsesOfConstructor {
    String name;
    int rolo_no;
    UsesOfConstructor(){
        System.out.println("Default Constructor is called");
    }
    UsesOfConstructor(String name){
        this.name=name;
    }
    UsesOfConstructor(int roll_no){
        this.rolo_no=roll_no;
    }
}
class Test{
    public static void main(String[] args) {
       // UsesOfConstructor u=new UsesOfConstructor();
        UsesOfConstructor u1=new UsesOfConstructor("navneet");
        UsesOfConstructor u2=new UsesOfConstructor(1234);
        System.out.println(u1.name+" "+u2.rolo_no);
    }
}
