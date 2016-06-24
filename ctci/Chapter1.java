public class Chapter1 {

    // 1.1
    public boolean checkDifferent(String iniString) {
        if (iniString.length() > 256) {
            return false;
        }
        for (int i = 0; i < iniString.length(); ++i) {
            for (int j = i + 1; j < iniString.length(); ++j) {
                if (iniString.charAt(i) == iniString.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

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
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iniString.length(); ++i) {
            sb.append(iniString.charAt(i) == ' ' ? "%20" : iniString.charAt(i));
        }
        return sb.toString();
    }

}
