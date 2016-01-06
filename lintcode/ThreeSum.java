/*
 *
 */
public class ThreeSum {

    public ArrayList<ArrayList<Integer>> threeSum(int[] numbers) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 2; ++i) {
            Set<Integer> set = new HashSet<Integer>();
            for (int j = i + 1; j < numbers.length; ++j) {
                if (set.contains(-numbers[i] - numbers[j])) {
                    ArrayList<Integer> list = new ArrayList<Integer>();
                    list.add(numbers[i]);
                    list.add(numbers[j]);
                    list.add(-numbers[i] - numbers[j]);
                    if (!result.contains(list)) {
                        result.add(list);
                    }
                }
                set.add(numbers[j]);
            }
        }
        return result;
    }

}
