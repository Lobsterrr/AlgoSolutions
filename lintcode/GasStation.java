/*
 *
 */
public class GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int result = -1;
        int gasSum = 0;
        int costSum = 0;
        for (int i = 0; i < gas.length; ++i) {
            gasSum += gas[i];
            costSum += cost[i];
        }
        if (gasSum < costSum) {
            return result;
        }
        

    }

}
