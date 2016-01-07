/*
 *
 */
public class Subsets {

    public ArrayList<ArrayList<Integer>> subsets(int[] nums) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        result.add(new ArrayList<Integer>());
        for (int num : nums) {
            for (ArrayList<Integer> list : result) {
                ArrayList<Integer> newList = new ArrayList<Integer>(list);
                newList.add(num);
                result.add(newList);
            }
        }
        return result;
    }

}
