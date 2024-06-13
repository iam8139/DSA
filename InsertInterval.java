class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        int n = intervals.length;

        int start = newInterval[0];
        int end = newInterval[1];

        if (n == 0 || (n > 0 && end < intervals[0][0])) list.add(new int[]{start, end});
        for (int i = 0; i < intervals.length; i++) {
            if (i < intervals.length-1 && intervals[i][1] < start && intervals[i+1][0] > end) {
                list.add(intervals[i]);
                list.add(new int[]{start, end});
            }
            else if (intervals[i][1] < start || intervals[i][0] > end) list.add(intervals[i]);
            else {
                int j = i;
                while (j < intervals.length) {
                    if (intervals[j][0] > end) break;
                    j++;
                }
                list.add(new int[]{Math.min(start, intervals[i][0]), Math.max(end, intervals[j-1][1])});
                i = (j-1);
            }
        }

        if (n > 0 && start > intervals[n-1][1]) list.add(new int[]{start, end});

        int[][] res = new int[list.size()][2];
        int k = 0;
        for (int[] temp : list) {
            res[k++] = temp;
        }

        return res;
    }
}
