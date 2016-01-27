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
        for (Interval interval : intervals) {
            if (!isOverlap(newInterval, interval)) {
                result.add(interval);
            } else {
                newInterval = new Interval(Math.min(interval.start, newInterval.start), Math.max(interval.end, newInterval.end));
            }
        }
        int i = 0; 
        for (; i < result.size() && result.get(i).start < newInterval.start; ++i);
        result.add(i, newInterval);
        return result;
    }

    public boolean isOverlap(Interval a, Interval b) {
        return !(a.start > b.end || a.end < b.start);
    }

}
