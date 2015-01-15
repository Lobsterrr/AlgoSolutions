/*
 * Given a positive integer, return its corresponding 
 * column title as appear in an Excel sheet.

 * For example:

 *     1 -> A
 *     2 -> B
 *     3 -> C
 *     ...
 *     26 -> Z
 *     27 -> AA
 *     28 -> AB 
 * 
 */
public class ExcelSheetColumnTitle {

    public String convertToTitle(int n) {
        String result = "";
		int count = 0;
		while (n > 0) {
			int remainder = n % (int) Math.pow(26, count + 1);
			if (remainder == 0)
				remainder = (int) Math.pow(26, count + 1);
			int c = remainder / (int) Math.pow(26, count);
			result = (char) (c + 64) + result;
			n -= remainder;
			count++;
		}
		return result;
    }

}
