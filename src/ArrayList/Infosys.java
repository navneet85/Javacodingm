package ArrayList;

import java.util.*;

public class Infosys {
    public static void main(String[] args) {
        int N=5;
        int M=4;
        ArrayList<Integer> A=new ArrayList<>();
        A.add(10);
        A.add(13);
        A.add(5);
        A.add(2);
        A.add(6);
        ArrayList<Integer> P=new ArrayList<>();
        P.add(2);
        P.add(4);
        ArrayList<Integer> C=new ArrayList<>();
        C.add(5);
        C.add(2);
        ArrayList<Integer> D=new ArrayList<>();
        D.add(1);
        D.add(5);
        ArrayList<Integer> E=new ArrayList<>();
        E.add(3);
        E.add(2);
        ArrayList<ArrayList<Integer>> Queries=new ArrayList<>();
        Queries.add(P);
        Queries.add(C);
        Queries.add(D);
        Queries.add(E);
        // System.out.println(Queries);
        System.out.println(A);
        // ArrayList<Integer> B=new ArrayList<>();
        ArrayList<Integer> Res=new ArrayList<>();
        for(int i=0;i<Queries.size();i++){
             int x=Queries.get(i).get(0);
             int y=Queries.get(i).get(1);
             int h=A.get(x-1)-y;
             ArrayList<Integer> B=new ArrayList<>();
             for(int j=0;j<A.size();j++){
                A.set(x-1, h);
             }
             System.out.println(A);
             B.add(A.get(0));
             for(int k=1;k<N;k++){
                 int l=Integer.min(A.get(k), B.get(k-1));
                 B.add(l);
             }
             System.out.println(B);
             HashSet<Integer> t = new HashSet<>(B);
             Res.add(t.size());
        }
        System.out.println(Res);
    }
}
