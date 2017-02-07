/*
Given an integer, write an algorithm to convert it to hexadecimal. For negative
integer, two’s complement method is used.

Note:

All letters in hexadecimal (a-f) must be in lowercase.
The hexadecimal string must not contain extra leading 0s. If the number is zero,
it is represented by a single zero character '0'; otherwise, the first 
character in the hexadecimal string will not be the zero character.
The given number is guaranteed to fit within the range of a 32-bit signed 
integer.
You must not use any method provided by the library which converts/formats the 
number to hex directly.
Example 1:

Input:
26

Output:
"1a"
Example 2:

Input:
-1

Output:
"ffffffff"
 */
public class ConvertANumberToHexadecimal {

    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        long x = 0;
        if (num < 0) {
            x = num + Integer.MAX_VALUE;
        }
        String result = "";
        while (x != 0) {
            int n = x & 15;
            if (n < 10) {
                result = n + result;
            } else {
                result = ((char) ('a' + (n - 10))) + result;
            }
            x /= 16;
        }
        return result;
    }

}
