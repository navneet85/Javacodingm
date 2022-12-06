package Oops;
interface Carnivores{
    void eats();
}
interface Herbivores{
    void eatsh();
}
public class MultipleInheritance implements Carnivores,Herbivores  {
    public void eats(){
        System.out.println("Eats Grass");
    }
    public void eatsh(){
        System.out.println("Eats Animal");
    }
    public static void main(String[] args) {
     MultipleInheritance m=new MultipleInheritance();
     m.eats();
     m.eatsh();   
    }
}
