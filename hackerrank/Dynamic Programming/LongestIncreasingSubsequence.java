/*
 * Problem Statement

 * An Introduction to the Longest Increasing Subsequence Problems

 * The task is to find the length of the longest subsequence in a given array 
 * of integers such that all elements of the subsequence are sorted in 
 * ascending order. For example, the length of the LIS for { 15, 27, 14, 38, 
 * 26, 55, 46, 65, 85 } is 6 and the longest increasing subsequence is {15, 
 * 27, 38, 55, 65, 85}. 
 *
 * Input Format

In the first line of input, there is a single number N. 
In the next N lines input the value of a[i].

Constraints 
1 ¡Ü N ¡Ü 106 
1 ¡Ü a[i] ¡Ü 105

Output Format

In a single line, output the length of the longest increasing sub-sequence.

Sample Input

5
2
7
4
3
8
Sample Output

3
Explanation

{2,7,8} is the longest increasing sub-sequence, hence the answer is 3 (the 
length of this sub-sequence).
 */
import java.util.Arrays;
import java.util.Scanner;

public class LongestIncreasingSubsequence {
    
    //TODO  TLE

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; ++i) {
            nums[i] = sc.nextInt();
        }
        System.out.println(lengthOfLIS(nums));
    }

    public static int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = 1; i < nums.length; ++i) {
            for (int j = 0; j < i; ++j) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int result = 0;
        for (int value : dp) {
            result = Math.max(result, value);
        }
        return result;
    }

}
