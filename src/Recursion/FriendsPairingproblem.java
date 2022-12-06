package Recursion;

public class FriendsPairingproblem {
    static int pair(int n){
        //base condition
        if(n==1|| n==2)return n;
        //single
        int fnm1=pair(n-1);
        //pair
        //pair choices=n-1
        //after pair call for n-2
        int fnm2=(n-1)*pair(n-2);
        return fnm1+fnm2;
    }
    public static void main(String[] args) {
        System.out.println(FriendsPairingproblem.pair(3));
    }
}
