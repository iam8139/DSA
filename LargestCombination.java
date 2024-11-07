class LargestCombination {
    public int largestCombination(int[] candidates) {
        // int[] arr = new int[24];
        int ans = 0;
        for (int i = 0; i < 24; i++) {
            int count = 0;
            for (int num : candidates) {
                if ((num & (1 << i)) != 0) {
                    count++;
                }
            }
            ans = Math.max(ans, count);
        }

        return ans;
    }

    private static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            max = Math.max(num, max);
        }

        return max;
    }
}
