package Trie;

public class Trie {
	// trie node
	static class TrieNode
	{
		TrieNode[] children = new TrieNode[26];
	
		// isEndOfWord is true if the node represents
		// end of a word
		boolean isEndOfWord;
		
		TrieNode(){
			isEndOfWord = false;
			for (int i = 0; i < 26; i++)
				children[i] = null;
		}
	};
	
	static TrieNode root; 
	
	// If not present, inserts key into trie
	// If the key is prefix of trie node, 
	// just marks leaf node
	static void insert(String key)
	{
		int index;
		TrieNode temp = root;
		for (int i = 0; i < key.length(); i++)
		{
			index = key.charAt(i) - 'a';
			if (temp.children[index] == null)
				temp.children[index] = new TrieNode();
	
			temp = temp.children[index];
		}
	
		// mark last node as leaf
		temp.isEndOfWord = true;
	}
	
	// Returns true if key presents in trie, else false
	static boolean search(String key)
	{
		int index;
		TrieNode temp = root;
	
		for (int i = 0; i < key.length(); i++)
		{
			index = key.charAt(i) - 'a';
	
			if (temp.children[index] == null)
				return false;
	
			temp = temp.children[index];
		}
	
		return (temp.isEndOfWord);
	}
	
	// Driver
	public static void main(String args[])
	{
		// Input keys (use only 'a' through 'z' and lower case)
		String keys[] = {"the", "a", "there", "answer", "any",
						"by", "bye", "their"};
	
		root = new TrieNode();
		for (int i = 0; i < keys.length ; i++){
			insert(keys[i]);  
        }
        System.out.println(search("answ"));
	}
}
