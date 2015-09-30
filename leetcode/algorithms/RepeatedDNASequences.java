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
            if (map.containsKey(sub))
                map.put(sub, map.get(sub) + 1);
            else 
                map.put(sub, 1);
            map.put(sub, map.containsKey(sub) ? 1 + map.get(sub) : 1;
        }
        List<String> result = new ArrayList<String>();
        for (String key : map.keySet()) {
            if (map.get(key) > 1)
                result.add(key);
        }
        return result;
    }
}
