/*
 *
 */
public class ThreeSumClosest {

    /**
     * @param numbers: Give an array numbers of n integer
     * @param target : An integer
     * @return : return the sum of the three integers, the sum closest target.
     */
    public int threeSumClosest(int[] numbers, int target) {
        int result = Integer.MAX_VALUE;
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 2; ++i) {
            if (i > 0 && numbers[i] == numbers[i - 1]) {
                continue;
            }
            int low = i + 1;
            int high = numbers.length - 1;
            while (low < high) {
                int sum = numbers[i] + numbers[low] + numbers[high];
                if (sum == target) {
                    return sum;
                } else if (sum < target) {
                    low++;
                } else if (sum > target) {
                    high++;
                }
                if (Math.abs(sum - target) < Math.abs(result - target)) {
                    result = sum;    
                }
            }
        }
        return result;
    }

}
