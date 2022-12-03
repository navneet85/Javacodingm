package Oops;
//compile time polymorphism
//static polymorphism
public class MethodOverloading {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.sum(1,2);
        c.sum(1.4, 1.8);
        c.sum("asd", "sdf");
    }
}
class Calculator{
   void sum(int a,int b){
    System.out.println(a+b);
   }
   void sum(double a,double b){
    System.out.println(a+b);
   }
   void sum(String a,String b){
    System.out.println(a+b);
   }
}
