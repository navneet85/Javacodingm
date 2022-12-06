package Oops;
//Q1.
// class Vehicle{
//     String name="Navneet";
// }
// class Car extends Vehicle{
//     String brand="Owns Audi";
// }

// public class Important {
//     public static void main(String[] args) {
//        Vehicle v=new Car(); 
//        System.out.println(v.name);
//        //same as Vehicle Object
//     }
// }
//Q2
///////////concept of function overriding
class Vehicle{
    void print(){
        System.out.println("Vehicle");
    }
}
class Car extends Vehicle{
    void print(){
        System.out.println("car");
    }
    void print1(){
        System.out.println("Audi");
    }
}
public class Important {
    public static void main(String[] args) {
        Car c=new Car();
        c.print();
        c.print1();
        Vehicle v=new Car();
        v.print();
        //v.print1();it will give error
    }
}
