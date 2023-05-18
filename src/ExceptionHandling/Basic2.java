package ExceptionHandling;
class EventExceptio extends Exception{
    public EventExceptio(String str){
        super(str);
    }
}
class OddException extends Exception{
    public OddException(String str){
        super(str);
    }
}
public class Basic2 {
    static void Valid(int i) throws EventExceptio{
        if(i%2!=0){
            throw new EventExceptio("no is not even");
        }
        else{
            System.out.println("no is valid");
        }
    }
    static void Fun(int i) throws OddException{
       if(i%2==0){
        throw new OddException("no is not odd");
       } 
       else{
        System.out.println("no is out");
       }
    }
    public static void main(String[] args) {
        try {
            //even number exception
            Valid(34);
            Fun(22);
        } catch (EventExceptio e) {
            // TODO: handle exception
            System.out.println(e);
        }
        catch (OddException e){
            System.out.println(e);
        }
    }
}
