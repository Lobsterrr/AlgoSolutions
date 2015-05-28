/*
 *
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
