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

    // O(n) time, O(n) space.
    public List<Integer> topKFrequent(int[] nums, int k) {
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

/*****************************************************************************/

    // O(n * lg(n)) time, O(n) space.
    public List<Integer> topKFrequent(int[] nums, int k) {
    public List<Integer> topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(k, new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                return p1.value - p2.value;
            }
        });
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            map.put(num, 1 + (map.containsKey(num) ? map.get(num) : 0));
        }
        for (int key : map.keySet()) {
            Pair p = new Pair(key, map.get(key));
            pq.offer(p);
            if (pq.size() > k) {
                pq.remove();
            }
        }
        List<Integer> result = new ArrayList<Integer>();
        while (!pq.isEmpty()) {
            result.add(pq.remove().key);
        }
        return result;
    }

    class Pair {
        int key;
        int value;
        Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

}
