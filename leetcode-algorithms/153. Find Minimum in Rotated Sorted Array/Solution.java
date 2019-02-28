class Solution {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int left = 0;
        int right = nums.length - 1;
        //int min = Integer.MIN_VALUE;
        
        while (left < right) {
            int mid = (right - left) /2 + left;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        //return min;
        return nums[left];
    }
}
