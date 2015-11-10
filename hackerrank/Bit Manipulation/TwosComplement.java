/*
 * Problem Statement

One of the basics of Computer Science is knowing how numbers are represented 
in 2's complement. Imagine that you write down all numbers between A and B 
inclusive in 2's complement representation using 32 bits. How many 1's will 
you write down in all ?

Input: 
The first line contains the number of test cases T (<=1000). Each of the next 
T lines contains two integers A and B.

Output: 
Output T lines, one corresponding to each test case.

Constraints: 
-2^31 <= A <= B <= 2^31 - 1

Sample Input: 
3 
-2 0 
-3 4 
-1 4

Sample Output: 
63 
99 
37

Explanation: 
For the first case, -2 contains 31 1's followed by a 0, -1 contains 32 1's and
0 contains 0 1's. Thus the total is 63. 
For the second case, the answer is 31 + 31 + 32 + 0 + 1 + 1 + 2 + 1 = 99
 */
public class TwosComplement {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; ++i) {
            int A = in.nextInt();
            int B = in.nextInt();
            int count = 0;
            for (int j = A; j <= B; ++j) {
                for (int k = 0; k < 32; ++k) {
                    if ((j & 1 << k) != 0) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

}
