class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;

        Arrays.sort(nums);
        int ans = 0;
        int temp = 1;

        int prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            if (curr - prev == 1) temp++;
            else if (curr - prev != 0) {
                ans = Math.max(temp, ans);
                temp = 1;
            }

            prev = curr;
        }

        return Math.max(ans, temp);
    }
}
