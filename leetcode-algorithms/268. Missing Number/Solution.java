class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n +1)/2;
        int tmp= 0;
        
        for (int i=0; i< n; i++) {
            tmp+= nums[i];
        }

        return sum - tmp;
    }
}
