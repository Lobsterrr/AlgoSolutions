/*
 * Given a collection of intervals, merge all overlapping intervals.

Example
Given intervals => merged intervals:

[                     [
  [1, 3],               [1, 6],
  [2, 6],      =>       [8, 10],
  [8, 10],              [15, 18]
  [15, 18]            ]
]

Challenge
O(n log n) time and O(1) extra space.
 */
/**
 * Definition of Interval:
 * public class Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 */
public class MergeIntervals {

    /**
     * @param intervals: Sorted interval list.
     * @return: A new sorted interval list.
     */
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> result = new ArrayList<Interval>();
        if (intervals.size() == 0) {
            return result;
        }
        result.add(intervals.get(0));
        for (int i = 1; i < intervals.size(); ++i) {
            
        }
        return result;
    }

}
