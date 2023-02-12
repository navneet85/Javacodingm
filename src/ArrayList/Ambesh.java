package ArrayList;


import java.util.*;
public class Ambesh {
    public static void main(String[] args) {
       String stockName[]=new String[3];
       int stockNumbers[]=new int[3];
       int price[]=new int[3];
       Scanner sc=new Scanner(System.in);
       for(int i=0;i<stockName.length;i++){
        System.out.println("enter stock "+i+" details");
        stockName[i]=sc.next();
        stockNumbers[i]=sc.nextInt();
        price[i]=sc.nextInt();
       }
       for(int j=0;j<stockName.length;j++){
            System.out.println("name:"+stockName[j]);
            System.out.println("number:"+stockNumbers[j]);
            System.out.println("price:"+price[j]);
       }

    }
}
