class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for (int i=0; i <= nums.length; i++) {
            //int value = target - nums[i];
            if (hm.containsKey(target - nums[i])) {
                return new int[] {hm.get(target - nums[i]), i};
            } else {
                hm.put(nums[i], i);
            }
        }
        return new int[] {0, 0};
    }
}
