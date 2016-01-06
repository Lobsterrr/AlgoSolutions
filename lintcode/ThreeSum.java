/*
 *
 */
public class ThreeSum {

    public ArrayList<ArrayList<Integer>> threeSum(int[] numbers) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 2; ++i) {
            if (i > 0 && numbers[i] == numbers[i - 1]) {
                continue;
            }
            int low = i + 1;
            int high = numbers.length - 1;
            while (low < high) {
                int sum = numbers[i] + numbers[low] + numbers[high];
                if (sum == 0) {
                    ArrayList<Integer> list = new ArrayList<Integer>();
                    list.add(numbers[i]);
                    list.add(numbers[low]);
                    list.add(numbers[high]);
                    result.add(list);
                    do {
                        low++;
                    } while (low < numbers.length && numbers[low] == numbers[low - 1]);
                    do {
                        high--;
                    } while (high < numbers.length - 1 && numbers[high] == numbers[high + 1]);
                } else if (sum < 0) {
                    low++;
                } else {
                    high--;
                }
            }
        }
        return result;
    }

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
