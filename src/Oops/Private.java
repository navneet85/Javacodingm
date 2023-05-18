package Oops;

public class Private {
    private String name;
    private String roll;
    void set(String name,String roll){
       this.name=name;
       this.roll=roll;
    }
    void get(){
        System.out.println(this.name+" "+this.roll);
    }
    public static void main(String[] args) {
        Private obj1=new Private();
        obj1.set("navneet", "123");
        obj1.get();

    }
}
