/*
 *
 */
public class MajorityNumberII {

    public int majorityNumber(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            map.put(num, 1 + (map.containsKey(num) ? map.get(num) : 0));
        }
        int result = 0;
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue > count) {
                result = entry.getKey();
                count = entry.getValue();
            }
        }
        return result;
    }

}
