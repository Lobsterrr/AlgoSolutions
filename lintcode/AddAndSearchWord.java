/*
 * Design a data structure that supports the following two operations: addWord(word) and search(word)

search(word) can search a literal word or a regular expression string containing only letters a-z or ..

A . means it can represent any one letter.

 Notice

You may assume that all words are consist of lowercase letters a-z.

Example
addWord("bad")
addWord("dad")
addWord("mad")
search("pad")  // return false
search("bad")  // return true
search(".ad")  // return true
search("b..")  // return true
 */
public class AddAndSearchWord {

    Trie trie = new Trie();

    // Adds a word into the data structure.
    public void addWord(String word) {
        // Write your code here
        trie.insert(word);
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        // Write your code here
        return dfs(trie, word);
    }

    public boolean dfs(Trie trie, String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        if (s.length() == 1) {
            if (s.charAt(0) == '.') {
                for (int i = 0; i < 26; ++i) {
                    if (trie.children[i] != null && trie.isLeaf) {
                        return true;
                    }
                }
                return false;
            } else {
                return trie.children[s.charAt(0) - 'a'] != null && trie.isLeaf;
            }
        } else {
            if (s.charAt(0) == '.') {
                boolean flag = false;
                for (char c = 'a'; c <= 'z'; ++c) {
                    flag = flag || dfs(trie.children[c - 'a'], s.substring(1));
                }
                return flag;
            } else {
                return dfs(trie.children[s.charAt(0) - 'a'], s.substring(1));
            }
        }
    }

}
// Your WordDictionary object will be instantiated and called as such:
// WordDictionary wordDictionary = new WordDictionary();
// wordDictionary.addWord("word");
// wordDictionary.search("pattern");

class TrieNode {

    TrieNode[] children;
    boolean isLeaf;

    public TrieNode() {
        children = new TrieNode[26];
        isLeaf = false;
    }

}

class Trie {

    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String s) {
        TrieNode cur = root;
        for (char c : s.toCharArray()) {
            if (cur.children[c - 'a'] == null) {
                cur.children[c - 'a'] = new TrieNode();
            }
            cur = cur.children[c - 'a'];
        }
        cur.isLeaf = true;
    }

    public boolean startsWith(String prefix) {
        TrieNode cur = root;
        for (char c : prefix.toCharArray()) {
            if (cur.children[c - 'a'] == null) {
                return false;
            }
            cur = cur.children[c - 'a'];
        }
        return false;
    }

    public boolean search(String s) {
        TrieNode cur = root;
        for (char c : s.toCharArray()) {
            if (cur.children[c - 'a'] == null) {
                return false;
            }
            cur = cur.children[c - 'a'];
        }
        return cur.isLeaf;
    }

}
