/*
The Hamming distance between two integers is the number of positions at which 
the corresponding bits are different.

Now your job is to find the total Hamming distance between all pairs of the 
given numbers.

Example:
Input: 4, 14, 2

Output: 6

Explanation: In binary representation, the 4 is 0100, 14 is 1110, and 2 is 0010
(just showing the four bits relevant in this case). So the answer will be:
HammingDistance(4, 14) + HammingDistance(4, 2) + HammingDistance(14, 2) 
= 2 + 2 + 2 = 6.
Note:
Elements of the given array are in the range of 0 to 10^9
Length of the array will not exceed 10^4.
 */
public class TotalHammingDistance {

    // O(n) time, O(1) space.
    public int totalHammingDistance(int[] nums) {
        int result = 0;
        for (int i = 0; i < 32; ++i) {
            int bitOfOne = 0;
            for (int j = 0; j < nums.length; ++j) {
                bitOfOne += (nums[j] >>> i) & 1;
            }
            result += bitOfOne * (nums.length - bitOfOne);
        }
        return result;
    }

/*****************************************************************************/

    O(n ^ 2) time, O(1) space.
    public int totalHammingDistance(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                result += hammingWeight(nums[i] ^ nums[j]);
            }
        }
        return result;
    }

    public int hammingWeight(int n) {
        n = (n & 0x55555555) + ((n >>> 1) & 0x55555555);
        n = (n & 0x33333333) + ((n >>> 2) & 0x33333333);
        n = (n & 0x0f0f0f0f) + ((n >>> 4) & 0x0f0f0f0f);
        n = (n & 0x00ff00ff) + ((n >>> 8) & 0x00ff00ff);
        n = (n & 0x0000ffff) + ((n >>> 16) & 0x0000ffff);
        return n;
    }

}
