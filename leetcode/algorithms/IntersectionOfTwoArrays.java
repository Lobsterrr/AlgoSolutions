/*
 * Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

Note:
Each element in the result must be unique.
The result can be in any order.
 */
public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums1) {
            map.put(num, 1 + map.containsKey(num) ? map.get(num) : 0);
        }
        for (int num : nums2) {

        }
    }

}
