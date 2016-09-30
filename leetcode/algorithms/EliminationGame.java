/*
 * There is a list of sorted integers from 1 to n. Starting from left to right, 
 * remove the first number and every other number afterward until you reach the 
 * end of the list.

 * Repeat the previous step again, but this time from right to left, remove the 
 * right most number and every other number from the remaining numbers.
 * 
 * We keep repeating the steps again, alternating left to right and right to 
 * left, until a single number remains.
 * 
 * Find the last number that remains starting with a list of length n.
 * 
 * Example:
 * 
 * Input:
 * n = 9,
 * 1 2 3 4 5 6 7 8 9
 * 2 4 6 8
 * 2 6
 * 6
 * 
 * Output:
 * 6
 */
public class EliminationGame {

    public int lastRemaining(int n) {
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 1; i <= n; ++i) {
            list.add(i);
        }
        boolean L2R = true;
        while (list.size() > 1) {
            if (L2R) {
                for (int i = (list.size() - 1) / 2 * 2; i >= 0; i -= 2) {
                    list.remove(i);
                }
            } else {
                for (int i = list.size() - 1; i >= 0; i -= 2) {
                    list.remove(i);
                }
            }
            L2R ~= L2R;
        }
        return list.get(0);
    }

}
