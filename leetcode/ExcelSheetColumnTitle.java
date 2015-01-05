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
        int exp = 0;
        while (n * 25 > (26 * Math.pow(26, epx + 1) - 26)) {
            exp++;
        }
        while (n > 0) {
            int coe = n * 25 / (26 * (int) Math.pow(26, exp) - 26);
            if (n == coe * (26 * (int) Math.pow(26, exp) - 26) / 25) {
                coe--;
            }
            result += coe == 0 ? 'A' : (char) (64 + coe);
            n -= 
        }



        while (n > Math.pow(26, exp + 1)) {
            exp++;
        }
        while (n > 0) {
            int coe = n / (int) Math.pow(26, exp);
            if (n > 26 && n == coe * (int) Math.pow(26, exp))
                coe--;
            result += coe == 0 ? 'A' : (char) (64 + coe);
            n -= coe * Math.pow(26, exp--);
        }
        return result;
    }

}
