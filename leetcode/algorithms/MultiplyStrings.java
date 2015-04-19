/*
 * Given two numbers represented as strings, return multiplication of the numbers as a string.

 * Note: The numbers can be arbitrarily large and are non-negative. 
 */
public class MultiplyStrings {

    public String multiply(String num1, String num2) {
        int len1 = num1.length(), len2 = num2.length();
        int[] num = new int[len1 + len2];
        for(int i = 0; i < len1; i++) {
            int carry = 0;
            int multiple1 = num1.charAt(len1 - 1 - i) - '0';
            for(int j = 0; j < len2; j++) {
                int multiple2 = num2.charAt(len2 - 1 - j) - '0';
                carry = multiple1 * multiple2 + carry + num[len1 + len2 - 1 - i - j];
                num[len1 + len2 - 1 - i - j] = carry % 10;
                carry /= 10;
            }
            num [len1 - i - 1] = carry;
        } 
        int start = 0;
        while(start < len1 + len2 && num[start] == 0) {
            start++;
        }
        if(start == len1 + len2)
            return "0";
        String result = "";
        for(int i = start; i < len1 + len2; i++) {
            result += num[i];
        }
        return result;
    }

    
    public String multiply(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int[] data = new int[len1 + len2];  
        for (int i = 0; i < len1; i++) {
            int carrier = 0;
            int a = num1.charAt(len1 - 1 - i) - '0';
            for (int j = 0; j < len2; j++) {
                int b = num2.charAt(len2 - 1 - j) - '0';
                int tmp = data[len1 - 1 - i + len2 - j];
                data[len1 - 1 - i + len2 - j] = (data[len1 - 1 - i + len2 - j] + carrier + a * b) % 10;
                carrier = (tmp + carrier + a * b) / 10;
            }
            data[len1 - 1 - i] = (data[len1 - 1 - i] + carrier) % 10;
        }
        String result = "";
        boolean flag = false;
        for (int i = 0; i < len1 + len2; i++) {
            if (data[i] != 0)
                flag = true;
            if (flag)
                result += data[i];
        }
        if (result.equals(""))
            result = "0";
        return result;
    }

}
