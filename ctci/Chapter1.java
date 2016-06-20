public class Chapter1 {

    public String reverseString(String iniString) {
        if (iniString == null) {
            return iniString;
        }
        for (int i = 0; i < iniString.length() / 2; ++i) {
            iniString = iniString.substring(0, i) 
                + iniString.charAt(iniString.length() - 1 - i) 
                + iniString.substring(i + 1, iniString.length() - 1 - i) 
                + iniString.charAt(i) 
                + iniString.substring(iniString.length() - i, iniString.length());
        }
        return iniString;
    }

    // 1.4
    public String replaceSpace(String iniString, int length) {
        String result = "";
        for (int i = 0; i < iniString.length(); ++i) {
            if (iniString.charAt(i) != ' ') {
                result += iniString.charAt(i);
            } else {
                result += "%20";
                while (i < iniString.length() && iniString.charAt(i) == ' ') {
                    i++;
                }
            }
        }
        return result;
    }

}
