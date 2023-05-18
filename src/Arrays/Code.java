package Arrays;
//newgen code
public class Code {
  public static void main(String[] args) {
    String str="my name is navneet kumar";
    String str1="";
    for(int i=str.length()-1;i>=0;i--){
       if(str.charAt(i)== ' '){
        continue;
       }
       str1+=str.charAt(i);
    }
    String stra[] = str.split(" ");
    int count[]=new int[stra.length];
    int p=0;
    for(int i=0;i<count.length;i++){
        count[i]=stra[i].length();
        System.out.print(str1.substring(p,p+count[i])+" ");
        p=p+count[i];
    }
    //////////////////////////////////
    CodeWithHr per = new CodeWithHr();
    System.out.println();
    System.out.println(per.x);
  }
}

class CodeWithHr {
   static int x = 10;
   static int p = 10;
   static int fun(){
    return x+ p;
   }
}
