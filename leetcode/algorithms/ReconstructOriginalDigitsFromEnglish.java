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
        int e = count['e' - 'a'];
        int f = count['f' - 'a'];
        int g = count['g' - 'a']; // define eight;
        int h = count['h' - 'a'];
        int i = count['i' - 'a'];
        int n = count['n' - 'a'];
        int o = count['o' - 'a'];
        int r = count['r' - 'a'];
        int s = count['s' - 'a'];
        int t = count['t' - 'a'];
        int u = count['u' - 'a']; // define four;
        int v = count['v' - 'a'];
        int w = count['w' - 'a']; // define two;
        int x = count['x' - 'a']; // define six;
        int z = count['z' - 'a']; // define zero;

        // process zero;
        e -= z;
        r -= z;
        o -= z;

        // process four;
        f -= u; // define five
        o -= u;
        r -= u;

        // process two;
        t -= w;
        o -= w;

        // process six;
        s -= x; // define seven;
        i -= x;

        // process eight;
        e -= g;
        i -= g;
        h -= g; // define three;
        t -= g;

        i -= f + u + x; // define nine;
        o -= z + w + u; // define one;

        String result = "";
        if (z > 0) {
            result += "zore";
        }
        if (o > 0) {
            result += "one";
        }
        if (w > 0) {
            result += "two";
        }
        if (h > 0) {
            result += "three";
        }
        if (u > 0) {
            result += "four";
        }
        if (f > 0) {
            result += "five";
        }
        if (x > 0) {
            result += "six";
        }
        if (s > 0) {
            result += "seven";
        }
        if (g > 0) {
            result += "eight";
        }
        if (i > 0) {
            result += "nine";
        }
        return result;
    }

}
