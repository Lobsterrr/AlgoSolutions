/*
 * Given an array of integers, find if the array 
 * contains any duplicates. Your function should 
 * return true if any value appears at least twice 
 * in the array, and it should return false if 
 * every element is distinct.
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int value : nums) {
            if (!set.contains(value))
                set.add(value);
            else 
                return true;
        }
        return false;
    }

}
