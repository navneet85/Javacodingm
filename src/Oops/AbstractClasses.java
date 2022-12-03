package Oops;

public class AbstractClasses {
    public static void main(String[] args) {
        //we cannont create object of abstract class
        //Animal a=new Animal();it will give error
        //we can create anstract or non_abstract methods
        //abstract method has no body
        Deer d=new Deer();
        d.eats();
        d.walk();
    }
}
abstract class Animal{
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
