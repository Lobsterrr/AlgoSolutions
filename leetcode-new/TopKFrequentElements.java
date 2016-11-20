/*
Given a non-empty array of integers, return the k most frequent elements.

For example,
Given [1,1,1,2,2,3] and k = 2, return [1,2].

Note: 
You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
Your algorithm's time complexity must be better than O(n log n), where n is the
array's size.
 */
public class TopKFrequentElements {

    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> result = new ArrayList<Integer>();
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int num : nums) {
            map.put(num, 1 + map.containsKey(num) ? map.get(num) : 0);
        }
        return result;
    }

}
