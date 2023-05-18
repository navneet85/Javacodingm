package Java8features;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambdaexp {
    /**
     * InnerLambdaexp
     */
    interface interface1 {
       int opern(int a,int b);   
    }
    interface interface2{
       void say(String mess); 
    }
    public static void main(String[] args) {
    
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);
    Consumer<Integer> method = (n) -> { System.out.println(n); };
    numbers.forEach( method );
    }
}
