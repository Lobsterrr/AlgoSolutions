/*
Given a string s, partition s such that every substring of the partition is a 
palindrome.

Return all possible palindrome partitioning of s.

For example, given s = "aab",
Return

[
  ["aa","b"],
  ["a","a","b"]
]
 */
public class PalindromePartitioning {

    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<List<String>>();
        if (isPalindrome(s)) {
            List<String> list = new ArrayList<String>();
            list.add(s);
            result.add(list);
            return result;
        }
        for (int i = 1; i < s.length(); ++i) {
            if (isPalindrome(s.substring(i))) {
                List<String> list = new ArrayList<String>();
                list.add(s.substring(i));
                list.addAll(partition(s.substring(i)));
                result.add(list);
            }
        }
        return result;
    }

    private boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        return s.equals(new StringBuilder(s).reverse().toString());
    }

}
