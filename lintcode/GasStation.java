/*
 *
 */
public class GasStation {

    /**
     * @param gas: an array of integers
     * @param cost: an array of integers
     * @return: an integer
     */
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasSum = 0;
        int costSum = 0;
        for (int i = 0; i < gas.length; ++i) {
            gasSum += gas[i];
            costSum += cost[i];
        }
        if (gasSum < costSum) {
            return -1;
        }
        int result = 0;
        int remainder = 0;
        for (int i = 0; i < gas.length; ++i) {
            remainder += gas[i] - cost[i];
            if (remainder < 0) {
                remainder = 0;
                result = i + 1;
            }
        }
        return result;
    }

}
