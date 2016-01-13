/*
 *
 */
public class Anagrams {

    public List<String> anagrams(String[] strs) {
        List<String> result = new ArrayList<String>();
        Map<String, String> map = new HashMap<String, String>();
        for (String str : strs) {
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String s = new String(array);
            if (!map.containsKey(s)) {
                map.put(s, str);
            } else {
                if (map.get(s) != null) {
                    result.add(map.get(s));
                    map.put(s, null);
                }
                result.add(str);
            }
        }
        return result; 
    }

}
