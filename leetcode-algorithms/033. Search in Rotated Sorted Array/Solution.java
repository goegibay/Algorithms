class Solution {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length ==0 ) return -1;
        
        int left = 0;
        int right = nums.length -1;
        
        while (left <= right ) {
            int mid = left + (right - left) /2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] >= nums[left]) { 
                //left side: regular sort, right side :rotated sort
                if (nums[left] <= target && target < nums[mid]) {
                    //left side
                    right = mid -1;
                } else {
                    left = mid +1;
                }
                
            } else {
                 //left side: rotated sort, right side :regular sort
                if (nums[mid] < target && target <= nums[right]) {
                    //right side
                    left = mid +1;
                } else {
                    right = mid -1;
                }
                
            }
        }
        
        return -1;
    }
}
