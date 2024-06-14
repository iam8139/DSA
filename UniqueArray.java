class UniqueArray {
    public int minIncrementForUnique(int[] nums) {
        int ans = 0;

        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i-1]) {
                ans += (nums[i-1] + 1 - nums[i]);
                nums[i] = nums[i-1] + 1;
            }
        }
        return ans;
    }
}
