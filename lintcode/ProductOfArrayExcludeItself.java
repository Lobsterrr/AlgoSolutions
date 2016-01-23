/*
 * Given an integers array A.

Define B[i] = A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1], 
calculate B WITHOUT divide operation.

Example
For A = [1, 2, 3], return [6, 3, 2].
 */
public class ProductOfArrayExcludeItself {

    /**
     * @param A: Given an integers array A
     * @return: A Long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public ArrayList<Long> productExcludeItself(ArrayList<Integer> A) {
        ArrayList<Long> result = new ArrayList<Long>();
        long[] products = new long[A.size()];
        Arrays.fill(products, 1);
        for (int i = 0; i < products.length; ++i) {
            for (int j = 0; j < products.length; ++j) {
                if (i == j) {
                    continue;
                }
                products[i] *= A.get(j);
            }
        }
        for (long product : products) {
            result.add(product);
        }
        return result;
    }

}
