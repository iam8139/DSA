class MinArrowShots {
    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        int arrows = 1;
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int[] prev = points[0];
        for (int i = 1; i < n; i++) {
            int start = points[i][0];
            int end = points[i][1];

            int prevStart = prev[0];
            int prevEnd = prev[1];

            if (start > prevEnd) {
                arrows++;
                prev = points[i];
            } else {
                prev[0] = Math.max(prevStart, start);
                prev[1] = Math.min(prevEnd, end);
            }
        }

        return arrows;
    }

    private static void updateOverlap(int[] temp, int j, int[][] points) {

        for (int k = j; k < points.length; k++) {
            if (points[k] != null) {
                if ((points[k][0] >= temp[0] && points[k][1] <= temp[1]) || 
                    (points[k][0] <= temp[0] && points[k][1] >= temp[0]) ||
                    (points[k][0] <= temp[1] && points[k][1] >= temp[1])) {
                        System.out.println("temp: " + temp[0] + "\t" + temp[1]);
                        System.out.println("points: " + points[k][0] + "\t" + points[k][1]);
                    points[k] = null;
                }
            }
        }
    }
}
