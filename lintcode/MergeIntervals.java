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
            if (!isOverlap(result.get(result.size() - 1), intervals.get(i))) {
                result.add(intervals.get(i));
            } else {
                Interval a = result.get(result.size() - 1);
                Interval b = intervals.get(i);
                Interval c = new Interval(Math.min(a.start, b.start), Math.max(a.end, b.end));
                result.remove(result.size() - 1);
                result.add(c);
            }
        }
        return result;
    }

    public boolean isOverlap(Interval a, Interval b) {
        return a.start <= b.end && a.end >= b.start;
    }

    class IntervalComparator implements Comparator<Interval> {
        public int compare(Interval i1, Interval i2) {
            return i1.start - i2.start;
        }
    }

}
