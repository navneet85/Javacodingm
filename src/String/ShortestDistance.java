package String;
public class ShortestDistance {
    public static void main(String[] args) {
       String str="WNEENESENNN";
       double x=0,y=0;
       for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        switch(ch){
            case 'E':x++;break;
            case 'W':x--;break;
            case 'N':y++;break;
            default:y--;
        }
       }
       System.out.println((int)Math.pow(x*x+y*y,0.5));
    }
}
