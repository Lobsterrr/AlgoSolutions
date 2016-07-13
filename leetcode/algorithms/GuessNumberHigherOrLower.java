/*
 *
 */
public class GuessNumberHigherOrLower {

    public int guessNumber(int n) {
        return guessNumber(1, n);
    }

    public int guessNumber(int low, int high) {
        int mid = low + (high - low) / 2;
        if (guess(mid) == 0) {
            return mid;
        } else if (if (guess(mid) == -1)) {
            return guessNumber(low, mid - 1);
        } else {
            return guessNumber(mid + 1, high);
        }
    }

}
