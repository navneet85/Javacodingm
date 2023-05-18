package Queue;

public class check {
    public static void main(String[] args) {
        String str="asd frg";
        StringBuilder sb= new StringBuilder("asdf");
        System.out.println(sb.reverse());
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
