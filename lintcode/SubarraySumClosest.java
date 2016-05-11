/*
 * Given an integer array, find a subarray with sum closest to zero. Return the 
 * indexes of the first number and last number.

Example
Given [-3, 1, 1, -3, 5], return [0, 2], [1, 3], [1, 1], [2, 2] or [0, 4].

Challenge 
O(nlogn) time
 */
public class SubarraySumClosest {

    /**
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number 
     *          and the index of the last number
     */
    public int[] subarraySumClosest(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int sum = 0;
        map.put(-1, 0);
        for (int i = 0; i < nums.length; ++i) {
            sum += nums[i];
            map.put(i, sum);
        }
        SortedSet<Map.Entry<Integer, Integer>> sortedSet = entriesSortedByValues(map);
        int closestSum = Integer.MAX_VALUE;
        int[] result = new int[2];
        Map.Entry<Integer, Integer> prevEntry = null;
        for (Map.Entry<Integer, Integer> entry :sortedSet) {
            if (prevEntry != null && (entry.getValue() - prevEntry.getValue() < closestSum)) {
                closestSum = entry.getValue() - prevEntry.getValue();
                result[0] = Math.min(entry.getKey(), prevEntry.getKey()) + 1;
                result[1] = Math.max(entry.getKey(), prevEntry.getKey());
            }
            prevEntry = entry;
        }
        return result;
    }

    public <K,V extends Comparable<? super V>> SortedSet<Map.Entry<K,V>> entriesSortedByValues(Map<K,V> map) {
        SortedSet<Map.Entry<K,V>> sortedEntries = new TreeSet<Map.Entry<K,V>>(
                new Comparator<Map.Entry<K,V>>() {
                    @Override public int compare(Map.Entry<K,V> e1, Map.Entry<K,V> e2) {
                        int res = e1.getValue().compareTo(e2.getValue());
                        return res != 0 ? res : 1;
                    }
                }
        );
        sortedEntries.addAll(map.entrySet());
        return sortedEntries;
    }

/*****************************************************************************/

    // TODO StackOverflowError
    public int[] subarraySumClosest(int[] nums) {
        int[] sum = new int[nums.length + 1];
        int[] index = new int[nums.length + 1];
        index[0] = -1;
        for (int i = 0; i < nums.length; ++i) {
            sum[i + 1] = sum[i] + nums[i];
            index[i + 1] = i;
        }
        quicksort(sum, 0, sum.length - 1, index);
        int closestSum = Integer.MAX_VALUE;
        int[] result = new int[2];
        for (int i = 1; i < sum.length; ++i) {
            if (closestSum > sum[i] - sum[i - 1]) {
                closestSum = sum[i] - sum[i - 1];
                result[0] = Math.min(index[i - 1], index[i]) + 1;
                result[1] = Math.max(index[i - 1], index[i]);
            }
        }
        return result;
    }

    public void quicksort(int[] a, int aLow, int aHigh, int[] b) {
        if (aLow >= aHigh) {
            return;
        }
        int index = aLow;
        for (int i = aLow; i < aHigh; ++i) {
            if (a[i] <= a[aHigh]) {
                swap(a, index, i);
                swap(b, index++, i);
            }
        }
        swap(a, index, aHigh);
        swap(b, index, aHigh);
        quicksort(a, aLow, index - 1, b);
        quicksort(a, index + 1, aHigh, b);
    }

    public void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

}
