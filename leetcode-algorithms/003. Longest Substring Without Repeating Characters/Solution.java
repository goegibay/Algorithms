class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap();
        int res = 0;
        
        for (int i = 0, j = 0; i< s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
                
            }
            map.put(s.charAt(i), i);
            res = Math.max(res, i - j + 1);
            
        }
        
        
        return res;
    }
}
