package Oops;
//runtime polymorphism
//dynamic polymorphism
public class MethodOverRiding {
    public static void main(String[] args) {
        Deer d1=new Deer();
        d1.eats();
    }
}
class Animal{
    void eats(){
        System.out.println("Animal eats");
    }
}
class Deer extends Animal{
    void eats(){
        System.out.println("Deer eats grass");
    }
}
