/*
 * Implement a trie with insert, search, and startsWith methods.

 * Note:
 * You may assume that all inputs are consist of lowercase letters a-z.
 */
class TrieNode {
    
    public TrieNode[] children;
    public String item;

    public TrieNode() {
        children = new TrieNode[26];
        item = "";
    }

}

public class ImplementTrie {

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode cur = root;
        for (char c : word.toCharArray()) {
            if (cur.children[c - 'a'] == null)
                cur.children[c - 'a'] = new TrieNode();
            cur = cur.children[c - 'a'];
        }
        cur.item = word;
    }

    public boolean search(String word) {
        TrieNode cur = roo;
        for (char c : word.toCharArray()) {
            if (cur.children[c - 'a'] == null)
                return false;

        }
    }

    public boolean startsWith(String prefix) {

    }

}
