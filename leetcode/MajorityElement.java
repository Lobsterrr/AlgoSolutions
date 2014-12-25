/*
 * Given an array of size n, find the majority element. The majority 
 * element is the element that appears more than ⌊ n/2 ⌋ times.

 * You may assume that the array is non-empty and the majority 
 * element always exist in the array. 
 */
public class MajorityElement {

    public int majorityElement(int[] num) {
        int result = 0;
        int maxCount = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < num.length; i++) {
            map.put(num[i], 1 + (map.containsKey(num[i]) ? 
                        map.get(num[i]) : 0));
            if (maxCount < map.get(num[i])) {
                maxCount = map.get(num[i]);
                result = num[i];
            }
        }
        return result;
    }

}
