public class Chapter18 {

    //18.1
    public int addAB(int A, int B) {
        while (B != 0) {
            int tmp = A ^ B;
            B = (A & B) << 1;
            A = tmp;
        }
        return A;
    }

}
