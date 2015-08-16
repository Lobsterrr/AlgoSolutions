/*
 *
 */
public class AddDigits {

    public int addDigits(int num) {
        while (num >= 10) {
            int digitSum = 0;
            while (num != 0) {
                digitSum += num % 10;
                num /= 10;
            }
            num = digitSum;
        }
        return num;
    }

    public int addDigits(int num) {
        int digitSum = 0;
        while (num > 0 || digitSum >= 10) {
            digitSum += num % 10;
            num /= 10;
            if (num == 0) {
                num = digitSum;
                digitSum = 0;
            }
        }
        return digitSum;
    }

}
