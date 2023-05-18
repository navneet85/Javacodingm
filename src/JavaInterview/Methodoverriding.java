package JavaInterview;
class Base{
  public static void run(){
    System.out.println("I am running");
  }
  public void fast(int a,int b){
    System.out.println(a+b);
  }
}

class Base2 extends Base{
    public static void run(){
        System.out.println("I am running fast");
      }
      public void fast(int a,int b){
        System.out.println(a*b);
      }
}

public class Methodoverriding {
    public static void main(String[] args) {
        Base obj=new Base2();
        obj.run();
        obj.fast(1, 2);
    }
}
