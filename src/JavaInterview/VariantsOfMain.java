package JavaInterview;

public class VariantsOfMain {
    //order of modifier does not matter
    //1.)String []navneet
    //2.)String navneet[]
    //3.)String... args
    //////////////
    //we can make string args final
    //we can make make main method final
    //we can overload main method like (int navneet[])
    //overriding is not possible
    //we can not declare main method as private it will throw runtime error as main method not found
    //private and static method can not be overrided in java
    static public void main(String[] navneet) {
        System.out.println("Love is life");
    }
    static public void main(int p[]){
        System.out.println("love");
    }
}
