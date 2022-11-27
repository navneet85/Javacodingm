package Arrays;

public class MaxSubArraySum {
    //bruteforce method(complexity o(n^3))
    public static int sum(int arr[],int start,int end){
        int sum=0;
        for(int i=start;i<=end;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    //prefixArraySum method(o(n^2))
    public static int sumPre(int arr[],int start,int end){
          return start==0?arr[end]:arr[end] -arr[start-1];
    }
    //kadanes method(o(n))
    public static int kadanes(int arr[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            if(cs<0 && check(arr)){
                cs=0;
            }
            if(cs>ms){
                ms=cs;
            }
        }
        return ms;
    }
    //check if all numbers are negative
    public static boolean check(int arr[]){
       for(int i=0;i<arr.length;i++){
            if(arr[i]>0) return true;
       }
       return false;
    }
    public static void main(String[] args) {
        //int arr[]={2,4,6,8,10};
        int arr[]={1,-2,6,-1,3};
        int arr2[]={-1,-2,-3,-4};
        int arr1[]={-2,-3,4,-1,-2,1,5,-3};
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
             prefix[i]=prefix[i-1]+arr[i];
        }
        int currentSum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int p=sumPre(prefix,i,j);
                if(p>currentSum){
                    currentSum=p;
                };
            }
        }
        System.out.println(currentSum);
        ////kadanes algorithm
        System.out.println(kadanes(arr1));
        System.out.println(check(arr2)+" "+kadanes(arr2));
    }
}
