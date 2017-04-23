/*
Description:

Count the number of prime numbers less than a non-negative number, n.
 */
public class CountPrimes {

    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[1] = false;
        for (int i = 1; i * i <= n; ++i) {
            if (isPrime[i]) {
                for (int j = i + 1; i * j <= n; ++j) {

                }
            }
        }
        
    }

}
