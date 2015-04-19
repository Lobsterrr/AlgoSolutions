/*
 * Given two numbers represented as strings, return multiplication 
 * of the numbers as a string.

 * Note: The numbers can be arbitrarily large and are non-negative. 
 */
public class MultiplyStrings {

    public String multiply(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int[] data = new int[len1 + len2];
        for (int i = len1 - 1; i >= 0; i--) {
            int carrier = 0;
            int a = num1.charAt(i) - '0';
            for (int j = len2 - 1; j >= 0; j--) {
                int b = num2.charAt(j) - '0';
                int tmp = data[i + j + 1];
                data[i + j + 1] = (tmp + carrier + a * b) % 10;
                carrier = (tmp + carrier + a * b) / 10;
            }
            data[i] = (data[i] + carrier) % 10;
        }
        int start = 0;
        while (start < data.length && data[start] == 0) {
            start++;
        }
        String result = "";
        for (int i = start; i < data.length; i++) {
            result += data[i];
        }
        return result.length() == 0 ? "0" : result;
    }

}
