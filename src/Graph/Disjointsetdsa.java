package Graph;

public class Disjointsetdsa {
    //constant time complexity
    static int n=7;
    static int par[]=new int[7];
    static int rank[]=new int[7];
    public static void init(){
        for(int i=0;i<n;i++){
            par[i]=i;
        }
    }
    public static int find(int a){
        if(a==par[a]){
            return a;
        }
        //path compression optimization
        // return find(par[a]);
        return par[a]=find(par[a]);
    }
    public static void union(int a,int b){
        int parA=find(a);
        int parB=find(b);
        if(rank[parA]==rank[parB]){
            par[parB]=parA;
            rank[parA]++;
        } else if(rank[parA]>rank[parB]){
               par[parB]=parA;
        } else{
            par[parA]=parB;
        }
    }
    public static void main(String[] args) {
        init();
        union(1, 3);
        System.out.println(find(3));
        union(2, 4);
        union(3,6);
        union(1,4);
        System.out.println(find(3));
        union(1, 5);
        System.out.println(find(5));
        
    }
}
