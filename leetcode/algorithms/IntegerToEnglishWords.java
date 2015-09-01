/*
 * Convert a non-negative integer to its english words 
 * representation. Given input is guaranteed to be 
 * less than 2^31 - 1.

 * For example,
 * 123 -> "One Hundred Twenty Three"
 * 12345 -> "Twelve Thousand Three Hundred Forty Five"
 * 1234567 -> "One Million Two Hundred Thirty Four 
 * Thousand Five Hundred Sixty Seven"
 *
 * Hint:
 * 
 * Did you see a pattern in dividing the number into 
 * chunk of words? For example, 123 and 123000.
 * Group the number by thousands (3 digits). You can 
 * write a helper function that takes a number less 
 * than 1000 and convert just that chunk to words.
 * There are many edge cases. What are some good test 
 * cases? Does your code work with input such as 0? 
 * Or 1000010? (middle chunk is zero and should not 
 * be printed out)
 */
public class IntegerToEnglishWords {

    public String numberToWords(int num) {
        String result = "";
        int len = ("" + num).length();

    }
    
    static String[] units = {"Thousand", "Million", "Billion"};

    static String[] ones = {"One", "Two", "Three", "Four", 
        "Five", "Six", "Seven", "Eight", "Nine"};
    
    static String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", 
        "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

    static String[] ties = {"Twenty", "Thirty", "Forty", 
        "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public String helper(int num) {
        if (num < 0 || num > 999)
            throw new IllegalArgumentException("illegal input");
        String result = "";
        if (num > 99) {
            result += ones[num / 100 - 1] + " Hundred";
            num %= 100;
        }
        if (10 <= num && num < 20) {
            if (result.length() > 0)
                result += " ";
            result += teens[num - 10];
        } else {
            if (num >= 20) {
                if (result.length() > 0)
                    result += " ";
                result += ties[num / 10 - 2];
                num %= 10;
            }
            if (0 < num && num < 10) {
                if (result.length() > 0)
                    result += " ";
                result += ones[num - 1];
            }
        }
        return result;
    }

}
