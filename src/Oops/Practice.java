package Oops;
interface name{
    void namex();
}
interface roll{
    void rollx();
}


public class Practice implements name,roll {
    void namex(){
       System.out.println("I love you");
    }
    void rollx(){
        System.out.println("I love you mm");
    }
    public static void main(String[] args) {
        Practice p=new Practice();
        p.namex();
    }
    
}
