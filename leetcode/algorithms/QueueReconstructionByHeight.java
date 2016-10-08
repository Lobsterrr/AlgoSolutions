/*
 * Suppose you have a random list of people standing in a queue. Each person is
 * described by a pair of integers (h, k), where h is the height of the person 
 * and k is the number of people in front of this person who have a height 
 * greater than or equal to h. Write an algorithm to reconstruct the queue.

 * Note:
 * The number of people is less than 1,100.
 * 
 * Example
 * 
 * Input:
 * [[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
 * 
 * Output:
 * [[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
 */
public class QueueReconstructionByHeight {

    public int[][] reconstructQueue(int[][] people) {
        if (people == null || people.length == 0) {
            return people;
        }
        for (int i = people.length - 1; i >= 0; --i) {
            for (int j = people.length - 1; j >= i; --j) {
                if (people[i][0] < people[j][0] || people[i][0] == people[j][0] 
                        && people[i][1] > people[j][1]) {
                    swap(people, i, j);
                }
            }
        }
        List<Integer> indexList = new ArrayList<Integer>();
        List<Integer> valueList = new ArrayList<Integer>();
        for (int i = 0; i < people.length; ++i) {
            indexList.add(people[i][1], people[i][0]);
            valueList.add(people[i][1], people[i][1]);
        }
        for (int i = 0; i < people.length; ++i) {
            people[i][0] = indexList.get(i);
            people[i][1] = valueList.get(i);
        }
        return people;
    }

    public void swap(int[][] array, int row1, int row2) {
        int tmp0 = array[row1][0];
        int tmp1 = array[row1][1];
        array[row1][0] = array[row2][0];
        array[row1][1] = array[row2][1];
        array[row2][0] = tmp0;
        array[row2][1] = tmp1;
    }

}
