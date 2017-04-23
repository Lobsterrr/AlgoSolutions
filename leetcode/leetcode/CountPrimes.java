/*
Description:

Count the number of prime numbers less than a non-negative number, n.
 */
public class CountPrimes {

    public int countPrimes(int n) {
        if (n == 0) {
            return 0;
        }
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[1] = false;
        for (int i = 1; i * i <= n; ++i) {
            if (isPrime[i]) {
                for (int j = i; i * j <= n; ++j) {
                    isPrime[i * j] = false;
                }
            }
        }
        int result = 0;
        for (boolean num : isPrime) {
            result += num ? 1 : 0;
        }
        return result;
    }

}
