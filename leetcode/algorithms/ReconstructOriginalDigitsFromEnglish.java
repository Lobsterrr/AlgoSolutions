/*
 * Given a non-empty string containing an out-of-order English representation
 * of digits 0-9, output the digits in ascending order.

 * Note:
 * Input contains only lowercase English letters.
 * Input is guaranteed to be valid and can be transformed to its original 
 * digits. 
 * That means invalid inputs such as "abc" or "zerone" are not permitted.
 * Input length is less than 50,000.
 * Example 1:
 * Input: "owoztneoer"
 * 
 * Output: "012"
 * Example 2:
 * Input: "fviefuro"
 * 
 * Output: "45"
 */
public class ReconstructOriginalDigitsFromEnglish {

    public String originalDigits(String s) {
        // one, two, three, four, five, six, seven, eight, nine, zero
        // unique: g, u, w, x, z
        int[] count = new int[26];
        for (int i = 0; i < s.length(); ++i) {
            count[s.charAt(i) - 'a']++;
        }
        count['o' - 'a'] -= count['u' - 'a'] + count['w' - 'a'] + count['z' - 'a'];
        count['f' - 'a'] -= count['u' - 'a'];
        count['s' - 'a'] -= count['x' - 'a'];
        count['h' - 'a'] -= count['g' - 'a'];
        count['i' - 'a'] -= count['g' - 'a'] + count['x' - 'a'] + count['f' - 'a'];
        int nums = {count['z' - 'a'], count['o' - 'a'], count['w' - 'a'], 
            count['h' - 'a'], count['u' - 'a'], count['f' - 'a'], count['x' - 'a'], 
            count['s' - 'a'], count['g' - 'a'], count['i' - 'a']};
        String result = "";
        for (int j = 0; j < nums.length; ++j) {
            for (int k = 0; k < nums[j]; ++k) {
                result += j;
            }
        }
        return result;
    }

}
