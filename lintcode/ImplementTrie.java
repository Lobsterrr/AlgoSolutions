/*
 *
 */
public class ImplementTrie {

    private TrieNode root;

    public ImplementTrie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode cur = root;
        for (char c : word.toCharArrray()) {

        }
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {

    }

    // Returns if there is any word in the trie 
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {

    }

}

class TrieNode {

    TrieNode[] children;
    String item;

    // Initialize your data structure here.
    public TrieNode() {
        trie = new TrieNode[26];
        item = "";
    }

}
