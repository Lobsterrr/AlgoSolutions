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

    public int addAB(int A, int B) {
        if (B == 0) {
            return A;
        }
        return addAB(A ^ B, (A & B) << 1);
    }

    // 18.5
    public int getDistance(String[] article, int n, String x, String y) {
        if (article == null || article.length == 0) {
            return -1;
        }
        int result = article.length;
        for (int i = 0, ix = -1, iy = -1; i < article.length; ++i) {
            if (article[i].equals(x)) {
                ix = i;
            } else if (article[i].equals(y)) {
                iy = i;
            }
            if (ix != -1 && iy != -1) {
                result = Math.min(result, Math.abs(ix - iy));
            }
        }
        return result;
    }

    public int getDistance(String[] article, int n, String x, String y) {
        if (article == null || article.length == 0) {
            return -1;
        }
        List<Integer> xList = new ArrayList<Integer>();
        List<Integer> yList = new ArrayList<Integer>();
        for (int i = 0; i < article.length; ++i) {
            if (article[i].equals(x)) {
                xList.add(i);
            }
            if (article[i].equals(y)) {
                yList.add(i);
            }
        }
        if (xList.get(0) >= yList.get(yList.size() - 1)) {
            return xList.get(0) - yList.get(yList.size() - 1);
        }
        if (xList.get(xList.size() - 1) <= yList.get(0)) {
            return yList.get(0) - xList.get(xList.size() - 1);
        }
        int ix = 0;
        int iy = 0;
        int result = Integer.MAX_VALUE;
        while (ix < xList.size() && iy < yList.size()) {
            result = Math.min(result, Math.abs(xList.get(ix) - yList.get(iy)));
            if (xList.get(ix) == yList.get(iy)) {
                return 0;
            } else if (xList.get(ix) < yList.get(iy)) {
                ix++;
            } else {
                iy++;
            }
        }
        return result;
    }

}
