import java.util.*;
class Interval {
    int start;
    int end;
    public Interval(int start, int end) {
        this.start = start;
        this.end = end;}}
public class Interval_Scheduling {
    public static void main(String[] args) {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(2, 4));
        intervals.add(new Interval(3, 6));
        intervals.add(new Interval(5, 7));
        List<Interval> selectedIntervals = schedule(intervals);
        System.out.println("Selected Intervals:");
        for (Interval interval : selectedIntervals) {
            System.out.println("Start time: " + interval.start + ", End time: " + interval.end);}}
    public static List<Interval> schedule(List<Interval> intervals) {
        Collections.sort(intervals, Comparator.comparingInt(o -> o.end));
        List<Interval> selectedIntervals = new ArrayList<>();
        if (intervals.isEmpty()) return selectedIntervals;
        Interval lastSelected = intervals.get(0);
        selectedIntervals.add(lastSelected);
        for (int i = 1; i < intervals.size(); i++) {
            Interval current = intervals.get(i);
            if (current.start >= lastSelected.end) {
                selectedIntervals.add(current);
                lastSelected = current;
            }}
        return selectedIntervals;
    }}
