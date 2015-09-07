/*
 *
 */
public class Triangle {

    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        int xSize = triangle.size();
        for (int i = size - 2; i >= 0; --i) {
            for (int j = 0; j <= i; ++j) {
                triangle.get(i).get(j) += Math.min(triangle.get(i + 1).get(j), 
                        triangle.get(i + 1).get(j + 1));
            }
        }
        return triangle.get(0).get(0);
    }

}
