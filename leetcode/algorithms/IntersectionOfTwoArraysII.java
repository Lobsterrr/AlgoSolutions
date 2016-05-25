/*
 *
 */
public class IntersectionOfTwoArraysII {

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums1) {
            map.put(num, 1 + (map.containsKey(num) ? map.get(num) : 0)); 
        }
        List<Integer> list = new ArrayList<Integer>();
        for (int num : nums2) {
            
        }
    }

}
