/*
 *
 */
public class SingleNumber {
    /**
	 *@param A : an integer array
	 *return : a integer 
	 */
    public int singleNumber(int[] A) {
        int xor = 0;
        for (int a : A) {
            xor ^= a;
        }
        return xor;
    }

}
