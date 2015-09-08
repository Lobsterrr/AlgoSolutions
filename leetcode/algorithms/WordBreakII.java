/*
 * Given a string s and a dictionary of words dict, 
 * add spaces in s to construct a sentence where 
 * each word is a valid dictionary word.

 * Return all such possible sentences.
 * 
 * For example, given
 * s = "catsanddog",
 * dict = ["cat", "cats", "and", "sand", "dog"].
 * 
 * A solution is ["cats and dog", "cat sand dog"].
 */
public class WordBreakII {

    public List<String> wordBreak(String s, Set<String> wordDict) {
        List<String> result = new ArrayList<String>();
        dfs(result, s, wordDict);
        return result;
    }

    public void dfs(List<String> result, String s, Set<String> wordDict) {
        if (s.length() == 0)
            return;
        for (int i = 1; i <= s.length(); ++i) {
            if (wordDict.contains(s.substring(0, i))) {
                result.add(s.substring(0, i));
                dfs(result, s.substring(i), wordDict);
                result.remove(result.size() - 1);
            }
        }
    }

}
