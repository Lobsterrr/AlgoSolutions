/*
 * Given a range [m, n] where 0 <= m <= n <= 2147483647, return 
 * the bitwise AND of all numbers in this range, inclusive.

 * For example, given the range [5, 7], you should return 4.
 */
public class BitwiseANDOfNumbersRange {

    public int rangeBitwiseAnd(int m, int n) {
        int result = 0;
        String sm = toBinaryString(m);
        String sn = toBinaryString(n);
        int p = n - m;
        for (int i = 0; i < sm.length(); i++) {
            if (sm.charAt(i) == '1' && sn.charAt(i) == '1' && p <= (1 << sm.length() -  1 - i)) 
                result += 1 << sm.length() - 1 - i;
        }
        return result;
    }

    public String toBinaryString(int x) {
        String str = "";
        for (int i = 0; i < 32; i++) {
            if ((x & (1 << 31 - i)) != 0)
                str += "1";
            else
                str += "0";
        }
        return str;
    }

}
