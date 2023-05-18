package ExceptionHandling;
class InvalidAgeException  extends Exception  
{  
    public InvalidAgeException (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}  
public class Basic {
    public static void main(String[] args) {
        try {
            validate(13);
        } catch (Exception e) {
            System.out.println("Exception occured: " + e);  
        }
    }

    private static void validate(int i) throws InvalidAgeException{
        //
        if(i < 18){  
            throw new InvalidAgeException("age is not valid to vote");    
        } 
        else {   
            System.out.println("welcome to vote");   
        }   

    }
}
