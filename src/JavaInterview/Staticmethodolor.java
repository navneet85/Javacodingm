package JavaInterview;
class Base{
   static void print(){
     System.out.println("love you");
   }
   void display(){
    System.out.println("overriden");
   }
}
//static method can not be overriden
//static method though can be overloaded
public class Staticmethodolor extends Base {
    static void print(){
        System.out.println("my method");
    }
    void display(){
        System.out.println("overriden done");
       }
    public static void main(String[] args) {
        Base obj =new Staticmethodolor();
        obj.print();
    }
}
