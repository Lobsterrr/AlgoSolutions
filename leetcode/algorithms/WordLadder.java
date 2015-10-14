/*
 * Given two words (beginWord and endWord), and a dictionary's word list, find 
 * the length of shortest transformation sequence from beginWord to endWord, 
 * such that:

 * Only one letter can be changed at a time
 * Each intermediate word must exist in the word list
 * For example,
 * 
 * Given:
 * beginWord = "hit"
 * endWord = "cog"
 * wordList = ["hot","dot","dog","lot","log"]
 * As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
 * return its length 5.
 * 
 * Note:
 * Return 0 if there is no such transformation sequence.
 * All words have the same length.
 * All words contain only lowercase alphabetic characters.
 */
public class WordLadder {

    public int ladderLength(String beginWord, String endWord, 
            Set<String> wordList) {
        int distance = 0;
        Queue<String> queue = new LinkedList<String>();
        Map<String, Integer> map = new HashMap<String, Integer>();
        queue.offer(beginWord);
        map.put(beginWord, 1);
        while (!queue.isEmpty()) {
            String cur = queue.poll();
            for (int i = 0; i < cur.length(); ++i) {
                for (char c = 'a'; c <= 'z'; ++c) {
                    if (c == cur.charAt(i))
                        continue;
                    StringBuilder sb = new StringBuilder(cur);
                    sb.setCharAt(i, c);
                    if (sb.toString().equals(endWord))
                        return distance + 1;
                    if (wordList.contains(sb.toString()) && !map.containsKey(sb.toString())) {
                        queue.offer(sb.toString());
                        map.put(sb.toString(), distance + 1);
                    }
                }
                distance++;
            }
        }
        return 0;
    }

/*****************************************************************************/

    int result = Integer.MAX_VALUE;

    public int ladderLength(String beginWord, String endWord, 
            Set<String> wordList) {
        wordList.add(endWord);
        dfs(beginWord, endWord, wordList, 0);
        return result;
    }

    public void dfs(String cur, String endWord, Set<String> wordList, int count) {
        if (cur.equals(endWord)) {
            count++;
            result = Math.min(result, count);
            return;
        }
        for (int i = 0; i < cur.length(); ++i) {
            char[] array = cur.toCharArray();
            for (char c = 'a'; c <= 'z'; ++c) {
                if (array[i] == c)
                    continue;
                array[i] = c;
                String s = new String(array);
                if (wordList.contains(s)) {
                    count++;
                    wordList.remove(s);
                    dfs(s, endWord, wordList, count);
                    wordList.add(s);
                }
            }
        }
    }

}
