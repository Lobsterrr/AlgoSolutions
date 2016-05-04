/*
 *
 */
public class TopKFrequentElements {

    public List<Integer> topKrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            map.put(num, 1 + (map.containsKey(num) ? map.get(num) : 0));
        }
        List<Integer> result = new ArrayList<Integer>();
    }

}
