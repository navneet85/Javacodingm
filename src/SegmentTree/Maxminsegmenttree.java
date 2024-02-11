package SegmentTree;

public class Maxminsegmenttree {
    static int tree[];
    public static void init(int n){
        tree=new int[4*n];
    }
    public static void buildBst(int i,int si,int sj,int arr[]){
        if(si==sj){
            tree[i]=arr[si];
            return;
        }
        int mid=(si+sj)/2;
        buildBst(2*i+1, si, mid,arr);
        buildBst(2*i+2, mid+1, sj,arr);
        tree[i]=Math.max(tree[2*i+1],tree[2*i+2]);
    }
    public static int getMaxUtil(int i,int si,int sj,int qi,int qj){
        if(si>qj||sj<qi){//non-overlap
            return Integer.MIN_VALUE;
        } else if(si>=qi&& sj<=qj){//completete overlap
            return tree[i];
        } else{//partial overlap
             int mid=(si+sj)/2;
             int left=getMaxUtil(2*i+1,si,mid,qi,qj);
             int right=getMaxUtil(2*i+2,mid+1,sj,qi,qj);
            return Math.max(left,right);
        }    
    }

    public static int getMax(int arr[],int qi,int qj){
        int n=arr.length;
        return getMaxUtil(0,0,n-1,qi,qj);

    }
    public static void update(int arr[],int idx,int newVal){
        int n=arr.length;
        arr[idx]=newVal;
        updateUtil(0,0,n-1,idx,newVal);
    }
    private static void updateUtil(int i, int si, int sj, int idx, int newVal) {
        if(idx>sj||idx<si){
            return;
        }
        tree[i]=Math.max(tree[i],newVal);
        if(si!=sj){//non-leaf
            int mid=(si+sj)/2;
            updateUtil(2*i+1,si,mid,idx,newVal);//update left subtree
            updateUtil(2*i+2,mid+1,sj,idx,newVal);//update right subtree
        }

    }

    public static void main(String[] args) {
        int arr[]={6,8,-1,2,17,1,3,2,4};
        int n=arr.length;
        init(n);
        buildBst(0, 0, n-1,arr);
        for(int i=0;i<tree.length;i++){
            System.out.print(tree[i]+" ");
        }
        System.out.println();
        System.out.println(getMax(arr, 1, 3));
        update(arr, 2, 20);
        System.out.println(getMax(arr, 2, 5));

        
    }
}
