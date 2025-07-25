class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length, l = 0, r = n - 1, m = 0;

        while (l <= r) {
            m = l + (r - l) / 2;

            if (nums[m] == target) {
                int x = m;
                while (m > 0 && nums[m - 1] == target) {
                    m--;
                }
                while (x < n - 1 && nums[x + 1] == target) {
                    x++;
                }
                return new int[]{m, x};
            } else if (nums[m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return new int[]{-1, -1};
    }
}