package Oops.Assighnments;

class Complex{
 int real;
 int img;
  public Complex(int a,int b){
    real=a;
    img=b;
  }
  Complex(){

  }
  public static Complex add(Complex a,Complex b){
     return new Complex((a.real+b.real),(a.img+b.img));
  }
  public static void print(Complex a){
    if(a.real>0 && a.img>0){
        System.out.println(a.real+"+"+a.img+"i");
    }
  }
}
public class FirstQues {
    public static void main(String[] args) {
        
        Complex a=new Complex(1,2);
        Complex b=new Complex(3,4);
        Complex.print(Complex.add(a, b));
        

    }
}
