/*
 * Given an array of integers, the majority number is the number that 
 * occurs more than 1/3 of the size of the array.

Find it.

Example
Given [1, 2, 1, 2, 1, 3, 3], return 1.

Note
There is only one majority number in the array.

Challenge
O(n) time and O(1) extra space.
 */
public class MajorityNumberII {

    /**
     * @param nums: A list of integers
     * @return: The majority number that occurs more than 1/3
     */
    public int majorityNumber(ArrayList<Integer> nums) {
        
    }

/*****************************************************************************/

    public int majorityNumber(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            map.put(num, 1 + (map.containsKey(num) ? map.get(num) : 0));
        }
        int result = 0;
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > count) {
                result = entry.getKey();
                count = entry.getValue();
            }
        }
        return result;
    }

}
