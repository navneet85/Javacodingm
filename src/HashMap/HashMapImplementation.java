package HashMap;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapImplementation {
    static class HashMap<K,V>{//for generic type
        private class Node{
          K key;
          V value;
          Node(K key,V value){
            this.key=key;
            this.value=value;
          }
        }
        private int n;//no of node
        private int N;
        private LinkedList<Node> buckets[];//N=buckets.length
        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N=4;
            this.buckets=new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();
            }
        }
        public int hashFunction(K key){
            int hc=key.hashCode();
            return Math.abs(hc)%buckets.length;

        }
        private int SearchInLL(K key,int bi){
            LinkedList<Node> ll=buckets[bi];
            int di=0;
            for(int i=0;i<ll.size();i++){
                Node node=ll.get(i);
                if(node.key==key){
                   return di;
                }
                di++;
            }
            return -1;
        }
        public void put(K key,V value){
            int bi=hashFunction(key);//index will be range from 0 to size-1
            int di=SearchInLL(key,bi);//ieither it will return key or will return -1
            if(di!=-1){
                Node node=buckets[bi].get(di);
                node.value=value;
            } else{
                buckets[bi].add(new Node(key,value));
                n++;
            }
            double lambda=(double)n/N;
            if(lambda>2.0){
                rehash();
            }

        }
        private void rehash() {
            LinkedList<Node> oldBucket[]=buckets;
            buckets=new LinkedList[N*2];
            for(int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<Node>();
            }
            //to add nodes in bucket
            for(int i=0;i<oldBucket.length;i++){
                LinkedList<Node> ll=oldBucket[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.remove();
                    put(node.key,node.value);
                }
            }
        }

        public V get(K key){

            int bi=hashFunction(key);//index will be range from 0 to size-1
            int di=SearchInLL(key,bi);//ieither it will return key or will return -1
            if(di!=-1){
                Node node=buckets[bi].get(di);
                return node.value;
            } else{
                return null;
            }

        }

        public V remove(K key){
            int bi=hashFunction(key);//index will be range from 0 to size-1
            int di=SearchInLL(key,bi);//ieither it will return key or will return -1
            if(di!=-1){
                Node node=buckets[bi].remove(di);
                n--;
                return node.value;
            } else{
                return null;
            }

        }

        public boolean containsKey(K key){
            int bi=hashFunction(key);//index will be range from 0 to size-1
            int di=SearchInLL(key,bi);//ieither it will return key or will return -1
            if(di!=-1){
                
                return true;
            } else{
                return false;
            }

        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys=new ArrayList<>();
            for(int i=0;i<buckets.length;i++){
                LinkedList<Node> ll=buckets[i];
                for(Node node:ll){
                    keys.add(node.key);
                }
            }
            return keys;

        }

        public boolean isEmpty(){
            return n==0;
        }


    }
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        hm.put("India", 30);
        hm.put("nepal",20);
        hm.put("London",20);
        ArrayList<String> keys=hm.keySet();
        for(String str:keys){
            System.out.println(str);
        }
        System.out.println(hm.get("India"));
        System.out.println(hm.remove("India"));
        System.out.println(hm.get("India"));

    }
}
