/*
 *
 */
public class Subsets {

    public ArrayList<ArrayList<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        result.add(new ArrayList<Integer>());
        for (int num : nums) {
            ArrayList<ArrayList<Integer>> newResult = new ArrayList<ArrayList<Integer>>();
            for (ArrayList<Integer> list : result) {
                ArrayList<Integer> newList = new ArrayList<Integer>(list);
                newList.add(num);
                newResult.add(newList);
            }
            result.addAll(newResult);
        }
        return result;
    }

}
