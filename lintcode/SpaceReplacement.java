/*
 * Write a method to replace all spaces in a string with 
 * %20. The string is given in a characters array, you can 
 * assume it has enough space for replacement and you are 
 * given the true length of the string.

You code should also return the new length of the string 
after replacement.

Example
Given "Mr John Smith", length = 13.

The string after replacement should be "Mr%20John%20Smith".

Note
If you are using Java or Python£¬please use characters 
array instead of string.

Challenge
Do it in-place.
 */
public class SpaceReplacement {

    /**
     * @param string: An array of Char
     * @param length: The true length of the string
     * @return: The true length of new string
     */
    public int replaceBlank(char[] string, int length) {
        int blankCount = 0;
        for (int i = 0; i < string; ++i) {
            if (string[i] == ' ') {
                blankCount++;
            }
        }
        
    }

}
