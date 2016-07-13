/*
 *
 */
public class GuessNumberHigherOrLower {

    public int guessNumber(int n) {
        return guessNumber(1, n);
    }

    public int guessNumber(int low, int high) {
        if (low <= 0 || low > high) {
            throw new IllegalArgumentException("illegal input");
        }
        while (low < high) {
            int mid = low + (high - low) / 2;
            int guess = guess(mid);
            if (guess == 0) {
                return mid;
            } else if (guess = -1) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public int guessNumber(int low, int high) {
        if (low <= 0 || low > high) {
            throw new IllegalArgumentException("illegal input");
        }
        int mid = low + (high - low) / 2;
        if (guess(mid) == 0) {
            return mid;
        } else if (guess(mid) == -1) {
            return guessNumber(low, mid - 1);
        } else {
            return guessNumber(mid + 1, high);
        }
    }

}
