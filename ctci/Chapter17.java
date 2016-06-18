public class Chapter17 {

    public int[] exchangeAB(int[] AB) {
        // write code here
        AB[0] ^= AB[1];
        AB[1] ^= AB[0];
        AB[0] ^= AB[1];
        return AB;
    }

    // 17.9
    public int getFrequency(String[] article, int n, String word) {
        // write code here
        int count = 0;
        for (String s : article) {
            count += s.equals(word) ? 1 : 0;
        }
        return count;
    }

}
