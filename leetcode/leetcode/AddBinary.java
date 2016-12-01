/*
Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".
 */
public class AddBinary {

    public String addBinary(String a, String b) {
        String result = "";
        for (int i = a.length() - 1, j = b.length() - 1, carrier = 0; i >= 0 || j >= 0 || carrier > 0; --i, --j, carrier /= 2) {
            carrier += i >= 0 ? (a.charAt(i) - '0') : 0;
            carrier += j >= 0 ? (b.charAt(j) - '0') : 0;
            result = carrier % 2 + result;
        }
        return result;
    }



    public String addBinary(String a, String b) {
        String result = "";
        int carrier = 0;
        for (int i = 0; i < Math.max(a.length(), b.length()); ++i) {
            int va = i < a.length() ? a.charAt(a.length() - 1 - i) - '0' : 0;
            int vb = i < b.length() ? b.charAt(b.length() - 1 - i) - '0' : 0;
            result = ((va + vb + carrier) % 2) + result;
            carrier = (va + vb + carrier) / 2;
        }
        if (carrier == 1) {
            result = carrier + result;
        }
        return result;
    }

}
