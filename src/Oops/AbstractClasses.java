package Oops;
abstract class Animal{
    // String color;
    // Animal(){
    //     this.color="Brown";
    // }
    void eats(){
       System.out.println("Animal eats");
    }
    abstract void walk();
}
class Deer extends Animal{
     void walk(){
        System.out.println("walks on 4 leg");
     }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("walks on 2 leg");
    }
}

public class AbstractClasses {
    public static void main(String[] args) {
        //we cannont create object of abstract class
        //Animal a=new Animal();it will give error
        //we can create anstract or non_abstract methods
        //abstract method has no body
        Deer d=new Deer();
        d.eats();
        d.walk();
        Chicken c=new Chicken();
        c.eats();
        c.walk();
    }
}
