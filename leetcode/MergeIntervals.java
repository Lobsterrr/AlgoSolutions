/*
 * Given a collection of intervals, merge all overlapping intervals.

 * For example,
 * Given [1,3],[2,6],[8,10],[15,18],
 * return [1,6],[8,10],[15,18].
 */
/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public clss MergeIntervals {
    public void quicksort(ArrayList<Interval> intervals, int low, int high) {
        if(low >= high)
            return ;
        int i = low - 1;
        for(int j = low; j < high; j++) {
            if(intervals.get(j).start <= intervals.get(high).start) {
                i++;
                swap(intervals, i, j);
            }
        }
        swap(intervals, i + 1, high);
        quicksort(intervals, low, i);
        quicksort(intervals, i + 1, high);
    }
    
    public void swap(ArrayList<Interval> intervals, int i, int j) {
        Interval temp = intervals.get(i);
        intervals.set(i, intervals.get(j));
        intervals.set(j, temp);
    }

    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        quicksort(intervals, 0, intervals.size() - 1);
        for(int i = 0; i < intervals.size() - 1; i++) {
            while(i < intervals.size() - 1 && intervals.get(i).end >= intervals.get(i + 1).start) {
                if(intervals.get(i).end >= intervals.get(i + 1).start) {
                    intervals.get(i).start = Math.min(intervals.get(i).start, intervals.get(i + 1).start);
                    intervals.get(i).end = Math.max(intervals.get(i).end, intervals.get(i + 1).end);
                    intervals.remove(i + 1);
                }
            }
        }
        return intervals;
    }    

/*****************************************************************************/

    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> result = new ArrayList<Interval>();
        if (intervals.size() == 0)
            return result;
        quicksort(intervals, 0, intervals.size() - 1);
        Interval prev = intervals.get(0);
        for (int i = 1; i < intervals.size(); i++) {
            if (prev.end < intervals.get(i).start) {
                result.add(prev);
                prev = intervals.get(i);
            } else {
                int end = Math.max(prev.end, intervals.get(i).end);
                prev = new Interval(prev.start, end);
            }
        }
        result.add(prev);
        return result;
    }

    public void quicksort(List<Interval> intervals, int low, int high) {
        if (low >= high)
            return;
        int i = low;
        for (int j = low; j < high; j++) {
            if (intervals.get(j).start <= intervals.get(high).start) {
                swap(intervals, i++, j);
            }
        }
        swap(intervals, i, high);
        quicksort(intervals, low, i - 1);
        quicksort(intervals, i, high);
    }

    public void swap(List<Interval> intervals, int i, int j) {
        Interval tmp = intervals.get(i);
        intervals.set(i, intervals.get(j));
        intervals.set(j, tmp);
    }

}
