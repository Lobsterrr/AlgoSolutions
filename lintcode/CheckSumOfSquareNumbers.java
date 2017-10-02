/*
Given a integer c, your task is to decide whether there're two integers a and b
such that a^2 + b^2 = c.

Example
Given n = 5
Return true // 1 * 1 + 2 * 2 = 5

Given n = -5
Return false
 */
public class CheckSumOfSquareNumbers {

    /*
     * @param : the given number
     * @return: whether whether there're two integers
     */
    public boolean checkSumOfSquareNumbers(int num) {
        boolean[] isSquare = new int[num + 1];
        isSquare[0] = true;
        for (int i = 1; i * i <= num; ++i) {
            isSquare[i * i] = true;
        }
        for (int i = 0; i * i <= num; ++i) {
            int delta = num - i * i;
            if (isSquare[delta]) {
                return true;
            }
        }
        return false;
    }

}
