import java.util.ArrayList;
import java.util.List;

public class Interval {
    int start, end;

    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

/**
 * Definition of Interval: public classs Interval { int start, end; Interval(int
 * start, int end) { this.start = start; this.end = end; } }
 */
public class Solution {
    /**
     * @param intervals: an array of meeting time intervals
     * @return: if a person could attend all meetings
     */
    public boolean canAttendMeetings(List<Interval> intervals) {
        if (intervals == null || intervals.isEmpty())
            return true;

        intervals.sort((val1, val2) -> val1.start - val2.start);

        boolean result = true;
        int left = 0;
        int right = 1;

        Interval last = intervals.get(left);

        while (right < intervals.size()) {
            Interval val = intervals.get(right++);

            if (compare(last, val) == 0) {
                result = false;
                break;
            } else {
                last = intervals.get(++left);
                last.start = val.start;
                last.end = val.end;
            }
        }

        return result;
    }

    private static int compare(Interval val1, Interval val2) {
        int result = 0;

        if (val1.end <= val2.start)
            result = -1;
        else if (val1.start >= val2.end)
            result = 1;

        return result;
    }
}

public class helper {
    public static void main(String[] args) {
        Solution solution = new Solution();

        List<Interval> list = new ArrayList<Interval>();

        // list.add(new Interval(0, 30));
        // list.add(new Interval(5, 10));
        // list.add(new Interval(15, 20));

        list.add(new Interval(5, 8));
        list.add(new Interval(9, 15));

        System.out.println(solution.canAttendMeetings(list));
    }
}
