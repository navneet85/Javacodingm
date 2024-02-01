package Trie;

public class WordBreakProblem {
    static class TrieNode{
        TrieNode child[]=new TrieNode[26];
        boolean isEndOfWord;
        TrieNode(){
            this.isEndOfWord=false;
            for(int i=0;i<child.length;i++){
                child[i]=null;
            }
        }
        public TrieNode getChild(char ch) {
            return child[ch-'a'];
        }
    }
    static TrieNode root;
    static void insert(String key){
        int idx;
        TrieNode temp=root;
        for(int i=0;i<key.length();i++){
            idx=key.charAt(i)-'a';
            if(temp.child[idx]==null){
                temp.child[idx]=new TrieNode();
            }
        temp=temp.child[idx];
        }
        temp.isEndOfWord=true;
    }
    static boolean search(String key){
        int idx;
        TrieNode temp=root;
        for(int i=0;i<key.length();i++){
            idx=key.charAt(i)-'a';
            if(temp.child[idx]==null){
                return false;
            }
            temp=temp.child[idx];
        }
        return temp.isEndOfWord;
    }
    public static boolean startsWith(String prefix) {
        TrieNode temp = root;
        for (char ch : prefix.toCharArray()) {
            if (temp.getChild(ch) == null) {
                return false;
            } else {
                temp = temp.getChild(ch);
            }
        }
        return true;
    }
    public static boolean isWordBreak(String str){
        StringBuilder str2=new StringBuilder();
        for(int i=0;i<str.length();i++){

            str2.append(str.charAt(i));
            StringBuilder sb=new StringBuilder(str2);
            if(i<str.length()-1){
                sb.append(str.charAt(i+1));
            }
            System.out.println(str2+" "+sb);
            System.out.println((search(str2.toString())+" "+startsWith(sb.toString())));

            
            if((search(str2.toString()) && !startsWith(sb.toString()))){

                str2.delete(0, str2.length());
            }
        }
        if(search(str2.toString())){
            return true;

        } else{
            return false;
        }

    }
    public static void main(String[] args) {
        String words[]={"a","b","bbbb","bbb"};
        String str="bb";
        root=new TrieNode();
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        System.out.println(isWordBreak(str));
        // System.out.println(search("sams"));
        // System.out.println(startsWith("samt"));
        
        
        
    }
}
