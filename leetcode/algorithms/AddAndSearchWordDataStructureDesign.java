/**
 *
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
    public String item;

    public TrieNode() {
        children = new Trie[26];
        item = "";
    }

}
