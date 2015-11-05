/*
 *
 */
public class PlusMinus {

    public static  void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 0;
        for (int i = 0; i < n; ++i) {
            int input = in.nextInt();
            if (input > 0) {
                a++;
            } else if (input < 0) {
                b++;
            }
        }
        System.out.println(processDouble((double) a / n, 3));
        System.out.println(processDouble((double) b / n, 3));
        System.out.println(processDouble((double) (n - a - b) / n, 3));
    }

    public static double processDouble(double num, int bits) {
        BigDecimal bd = new BigDecimal(num);
        return bd.setScale(bits, RoundingMode.HALF.UP).doubleValue();
    }

}
