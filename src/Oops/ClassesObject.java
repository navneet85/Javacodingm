package Oops;
class Pen{
    String color;
    int tip;
    void setColor(String color){
        this.color=color;
    }
    void setTip(int tip){
        this.tip=tip;
    }
    void print(){
        System.out.println(color+" "+tip);
    }
}
public class ClassesObject {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColor("Black");
        p1.setTip(4);
        p1.print();
    }
}
