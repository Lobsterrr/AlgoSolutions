/*
 * Given an integer array of size n, find all elements 
 * that appear more than ⌊ n/3 ⌋ times. The algorithm 
 * should run in linear time and in O(1) space.
 */
public class MajorityElementII {

    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int value : nums) {
            int count = 0;
            if (map.containsKey(value)) 
                count = map.get(value);
            map.put(value, count + 1);
        }
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (maxCount < entry.getValue())
                maxCount = entry.getValue();
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (maxCount == entry.getValue())
                result.add(entry.getKey());
        }
        return result;
    }

}
