class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;
        
        
        int slow = 0; // for finding non zero
        int tmp = 0;
        for (int fast=0; fast < nums.length; fast++) {
            if (nums[fast] == 0) {
                continue;
            } 
            tmp = nums[slow];
            nums[slow] = nums[fast];
            nums[fast] = tmp;
            slow = slow +1;
        }
    }
}
