public class Chapter1 {

    public String reverseString(String iniString) {
        if (iniString == null) {
            return iniString;
        }
        for (int i = 0; i < iniString / 2; ++i) {
            iniString = iniString.substring(0, i) 
                + iniString.charAt(iniString - 1 - i) 
                + iniString.substring(i + 1, iniString - 1 - i) 
                + iniString.charAt(i) 
                + iniString.substring(iniString - i, iniString);
        }
        return iniString;
    }

}
