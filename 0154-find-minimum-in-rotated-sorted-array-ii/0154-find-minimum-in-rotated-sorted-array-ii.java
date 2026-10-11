class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[right]) {
                // Minimum is in the left part including mid
                right = mid;
            } else if (nums[mid] > nums[right]) {
                // Minimum is in the right part excluding mid
                left = mid + 1;
            } else {
                // nums[mid] == nums[right], cannot decide, reduce search space
                right--;
            }
        }

        return nums[left];
    }
}
