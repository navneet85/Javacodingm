package BitManipulation;

public class IthBit {
    public static int getIthBit(int n,int i){
        int bitmask=1<<i;
        if((n & bitmask)==0) return 0;
        else return 1;
    }
    public static void setIthBit(int n,int i){
        int bitmask=1<<i;
        n=n|bitmask;
    }
    public static int clearIthBit(int n,int i){
        int bitmask=1<<i;
        n=n^bitmask;
        return n;
    }
    public static void updateIthBit(int n,int i,int newbit){
        if(newbit==0){
            clearIthBit(n, i);
        }
        else{
            setIthBit(n, i);
        }
    }
    public static int clearLastIbits(int n,int i){
        // int p=n;
        // while(i>=0){
        //     p=clearIthBit(p, i);
        //     i--;
        // }
        // System.out.println(p);
        return n & (-1<<i); 

    }
    public static int clearRangeOfBits(int n,int i,int j){
        // int p=n;
        // while(i<=j){
        //    p=clearIthBit(p, i);
        //    i++;
        // }
        int a=(~0)<<(j+1);
        int b=(1<<i)-1;
        int c=a|b;
        return n & c;
    }
    public static void main(String[] args) {
      System.out.println(clearRangeOfBits(15, 1, 3));
    }
}
