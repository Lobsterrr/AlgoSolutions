/*
 *
 */
public class ThreeSum {

    public ArrayList<ArrayList<Integer>> threeSum(int[] numbers) {
        ArrayList<ArrayList<Integer>> result = 
            new ArrayList<ArrayList<Integer>>();
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 2; ++i) {
            if (i > 0 && numbers[i] == numbers[i - 1]) {
                continue;
            }
            int low = i + 1;
            int high = numbers.length - 1;
            while (low < high) {
                if (numbers[i] + numbers[low] + numbers[high] == 0) {
                    ArrayList<Integer> list = new ArrayList<Integer>();
                    list.add(numbers[i]);
                    list.add(numbers[low]);
                    list.add(numbers[high]);
                    result.add(list);
                    do {
                        low++;
                    } while (low < high && numbers[low] == numbers[low - 1]);
                    do {
                        high--;
                    } while (low < high && numbers[high] == numbers[high + 1]);
                } else if (numbers[i] + numbers[low] + numbers[high] < 0) {
                    low++;
                } else {
                    high--;
                }
            }
        }
        return result;
    }

}
