/*
 * All DNA is composed of a series of nucleotides abbreviated 
 * as A, C, G, and T, for example: "ACGAATTCCG". When studying 
 * DNA, it is sometimes useful to identify repeated sequences 
 * within the DNA.

 * Write a function to find all the 10-letter-long sequences 
 * (substrings) that occur more than once in a DNA molecule.
 * 
 * For example,
 * 
 * Given s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT",
 * 
 * Return:
 * ["AAAAACCCCC", "CCCCCAAAAA"].
 */
public class RepeatedDNASequences {

    public List<String> findRepeatedDnaSequences(String s) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i <= s.length() - 10; ++i) {
            String sub = s.substring(i, i + 10);
            map.put(sub, map.containsKey(sub) ? 1 + map.get(sub) : 1);
        }
        List<String> result = new ArrayList<String>();
        for (String key : map.keySet()) {
            if (map.get(key) > 1)
                result.add(key);
        }
        return result;
    }


    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<String>();
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        for (int i = 0; i <= s.length() - 10; ++i) {
            int hash = strToHash(s.substring(i, i + 10));
            if (map.containsKey(hash)) {
                if (!map.get(hash)) {
                    result.add(s.substring(i, i + 10));
                    map.put(hash, true);
                }
            } else {
                map.put(hash, false);
            }
        }
        return result;
    }

    public int strToHash(String s) {
        String decoder = "";
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == 'A')
                decoder += "0";
            else if (s.charAt(i) == 'C')
                decoder += "1";
            else if (s.charAt(i) == 'G')
                decoder += "2";
            else if (s.charAt(i) == 'T')
                decoder += "3";
        }
        return Integer.parseInt(decoder, 4);
    }
}
