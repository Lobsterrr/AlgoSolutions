/**
 *
 */
public class AddAndSearchWordDataStructureDesign {

}

class WordDictionary {

    private Trie trie;

    public WordDictionary() {
        trie = new Trie();
    }
    
    public void addWord(String word) {

    }

    public boolean search(String word) {

    }

}

class Trie {

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
        TrieNode cur = root;
        for (char c : word.toCharArray()) {
            if (cur.children[c - 'a'] != null) 
                cur = cur.children[c - 'a'];
        }
        return cur.item.equals(word);
    }

    public boolean startsWith(String prefix) {
        TrieNode cur = root;
        for (char c : prefix.toCharArray()) {
            if (cur.children[c - 'a'] == null)
                return false;
            cur = cur.children[c - 'a'];
        }
        return true;
    }

}

class TrieNode {
    
    public TrieNode[] children;
    public String item;

    public TrieNode() {
        children = new Trie[26];
        item = "";
    }

}
