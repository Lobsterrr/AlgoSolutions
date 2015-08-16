/*
 *
 */
public class AddDigits {

    public int addDigits(int num) {
        int digitSum = 0;
        while (num != 0 || digitSum >= 10) {
            if (num == 0) {
                num = digitSum;
            }
            digitSum += num % 10;
            num /= 10;
        }
        return num;
    }

}
