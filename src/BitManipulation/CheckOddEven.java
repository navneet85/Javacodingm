package BitManipulation;

public class CheckOddEven {
    public static void main(String[] args) {
        int n=69;
        int c=n&1;
        if(c==0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }
}
