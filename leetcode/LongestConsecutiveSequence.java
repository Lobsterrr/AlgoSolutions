/*
 * Given an unsorted array of integers, find the length 
 * of the longest consecutive elements sequence.

 * For example,
 * Given [100, 4, 200, 1, 3, 2],
 * The longest consecutive elements sequence is 
 * [1, 2, 3, 4]. Return its length: 4.

 * Your algorithm should run in O(n) complexity.
 */
public class LongestConsecutiveSequence {

    // time complexity is O(nlogn)
    public int longestConsecutive(int[] num) {
        Arrays.sort(num);
        int result = 1;
        int count = 1;
        for (int i = 1; i < num.length; i++) {
            if (num[i] == num[i - 1] + 1)
                count++;
            else if (num[i] != num[i - 1] && num[i] != num[i - 1] + 1)
                count = 1;
            result = Math.max(result, count);
        }
        return result;
    }

/*****************************************************************************/

	// time: O(n); space: O(n)
    public int longestConsecutive(int[] num) {
        int result = 1;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int value : num) {
            if (!map.containsKey(value)) {
                map.put(value, 1);
                if (map.containsKey(value - 1)) 
                    result = Math.max(result, merge(map, value - 1, value));
                if (map.containsKey(value + 1)) 
                    result = Math.max(result, merge(map, value, value + 1));
            }
        }
        return result;
    }

    public int merge(Map<Integer, Integer> map, int low, int high) {
        int upper = high + map.get(high) - 1;
        int lower = low - map.get(low) + 1;
        int len = upper - lower + 1;
        map.put(upper, len);
		map.put(lower, len);
        return len;
    }

/*****************************************************************************/
	// time: O(n); space: O(n)
    public int longestConsecutive(int[] num) {
        Set<Integer> set = new HashSet<Integer>();
        for(int value : num) 
            set.add(value);
        int max = 1;
        for(int value : num) 
            max = Math.max(max, getCount(set, value, false) + 
                    getCount(set, value + 1, true));
        return max;
    }

    public int getCount(Set<Integer> set, int value, boolean asc) {
        int cnt = 0;
        while(set.contains(value)) {
            cnt++;
            set.remove(value);
            value = asc ? value + 1 : value - 1;
        }
        return cnt;
    }
}
