public class Chapter18 {

    //18.1
    public int addAB(int A, int B) {
        while (B != 0) {
            int carrier = (A & B) << 1;
            A = A ^ B;
            B = carrier;
        }
        return A;
    }

}
