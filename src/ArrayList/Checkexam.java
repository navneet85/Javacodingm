package ArrayList;

public class Checkexam {

    public static void main(String[] args) {
        int n=3;
        int p=1;
        int flag=0;
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
              if(j==i || j==2*n-2-i){
                System.out.print(p);
              }
              else{
                System.out.print(" ");
              }
              
            }
            if(p==n){flag++;}
            if(p<n && flag==0){
            p++;
            }else{
            p--;
            }
            System.out.println(); 
        }
    }

}
