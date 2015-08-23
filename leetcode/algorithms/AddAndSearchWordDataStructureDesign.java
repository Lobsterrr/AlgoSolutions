/*
 * Design a data structure that supports the following two operations:

 * void addWord(word)
 * bool search(word)
 * search(word) can search a literal word or a regular expression 
 * string containing only letters a-z or .. A . means it can represent 
 * any one letter.
 * 
 * For example:
 * 
 * addWord("bad")
 * addWord("dad")
 * addWord("mad")
 * search("pad") -> false
 * search("bad") -> true
 * search(".ad") -> true
 * search("b..") -> true
 *
 * Note:
 * You may assume that all words are consist of lowercase letters a-z.
 */
public class AddAndSearchWordDataStructureDesign {

}

class WordDictionary {

    TrieNode root = new TrieNode();

    public void addWord(String word) {
        
    }

    public boolean search(String word) {

    }

}


class TrieNode {
    
    public TrieNode[] children;
    public isLeaf;

    public TrieNode() {
        children = new Trie[26];
        isLeaf = false;
    }

}
