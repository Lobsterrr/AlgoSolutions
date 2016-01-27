/*
 * Given a non-overlapping interval list which is sorted by start 
 * point.

Insert a new interval into it, make sure the list is still in order 
and non-overlapping (merge intervals if necessary).

Example
Insert [2, 5] into [[1,2], [5,9]], we get [[1,9]].

Insert [3, 4] into [[1,2], [5,9]], we get [[1,2], [3,4], [5,9]].
 */
/**
 * Definition of Interval:
 * public classs Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 */
public class InsertInterval {

    /**
     * Insert newInterval into intervals.
     * @param intervals: Sorted interval list.
     * @param newInterval: A new interval.
     * @return: A new sorted interval list.
     */
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, 
            Interval newInterval) {
        ArrayList<Interval> result = new ArrayList<Interval>();
        int nStart = newInterval.start;
        int nEnd = newInterval.end;
        for (Interval interval : intervals) {
            if (!isOverlap(newInterval, interval)) {
                continue;
            }
            int iStart = interval.start;
            int iEnd = interval.end;
            newInterval = new Interval(Math.min(iStart, nStart), Math.max(iEnd, nEnd));
            intervals.remove(interval);
        }
        intervals.add(newInterval);
        return result;
    }

    public boolean isOverlap(Interval a, Interval b) {
        return !(a.start > b.end || a.end < b.start);
    }

}
