ass Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) return new int[]{};
        
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> ret = new HashSet<>();
        
        for (int num: nums1) {
            set.add(num);
        }
        for (int num: nums2) {
            if (set.contains(num)) {
                ret.add(num);
            }
        }
        
        int k =0;
        int[] res = new int[ret.size()];
        for (int num: ret) {
            res[k++] = num;
        }
        return res;
    }
}
