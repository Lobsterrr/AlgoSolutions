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
