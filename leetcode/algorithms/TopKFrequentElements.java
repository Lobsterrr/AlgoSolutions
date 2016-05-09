/*
 * Given a non-empty array of integers, return the k most frequent elements.

 * For example,
 * Given [1,1,1,2,2,3] and k = 2, return [1,2].

 * Note: 
 * You may assume k is always valid, 1 <= k <= number of unique elements.
 * Your algorithm's time complexity must be better than O(n log n), where n is 
 * the array's size.
 */
public class TopKFrequentElements {

    public List<Integer> topKrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            map.put(num, 1 + (map.containsKey(num) ? map.get(num) : 0));
        }
        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        for (int key : map.keySet()) {
            if (bucket[map.get(key)] == null) {
                bucket[map.get(key)] = new ArrayList<Integer>();
            }
            bucket[map.get(key)].add(key);
        }
        List<Integer> result = new ArrayList<Integer>();
        for (int i = bucket.length - 1; i >= 0 && result.size() < k; --i) {
            if (bucket[i] != null) {
                result.addAll(bucket[i]);
            }
        }
        return result;
    }

}
