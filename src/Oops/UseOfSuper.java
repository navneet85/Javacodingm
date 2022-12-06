package Oops;
class Animal{
    Animal(){
        System.out.println("Animal Constructor");
    }
}
class Horse extends Animal{
    Horse(){
        super();
        System.out.println("horse Constructor called");
    }
}
public class UseOfSuper {
    public static void main(String[] args) {
        Horse h=new Horse();
    }
}
