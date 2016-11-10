/*
 Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
 */
public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 1; i <= numRows; ++i) {
            if (i == 1) {
                List<Integer> list = new ArrayList<Integer>();
                list.add(1);
                result.add(list);
            } else {
                List<Integer> list = new ArrayList<Integer>();
                list.add(1);
                for (int j = 1; j < i - 1; ++j) {
                    List<Integer> prev = result.get(i - 2);
                    int value = prev.get(j - 1) + prev.get(j);
                    list.add(value);
                }
                list.add(1);
                result.add(list);
            }
        }
        return result;
    }

}
