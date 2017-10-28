/*
Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2

Example
The length of both num1 and num2 is < 110.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */
public class BigIntegerMultiplication {

    public String multiply(String num1, String num2) {
        int[] arr1 = new int[num1.length()];
        int[] arr2 = new int[num2.length()];
        for (int i = 0; i < num1.length(); ++i) {
            arr1[i] = num1.charAt(i) - '0';
        }
        for (int i = 0; i < num2.length(); ++i) {
            arr2[i] = num2.charAt(i) - '0';
        }
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = arr1.length - 1; i >= 0; --i) {
            int carrier = 0;
            for (int j = arr2.length - 1; j >= 0; --j) {
                int product = arr1[i] * arr2[j];
                int sum = product + carrier + arr3[i + j];
                carrier = sum / 10;
                arr3 = sum % 10;
            }
            arr3[arr1.length - 1 - i + arr2.length] = carrier;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr3.length; ++i) {
            sb.append(arr3[i]);
        }
        return sb.toString();
    }

}
