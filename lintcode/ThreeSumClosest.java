/*
 *
 */
public class ThreeSumClosest {

    public int threeSumClosest(int[] numbers, int target) {
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 2; ++i) {
            if (i > 0 && numbers[i] == numbers[i - 1]) {
                continue;
            }
            int low = i + 1;
            int high = numbers.length - 1;
            while (low < high) {

            }
        }
    }

}
