class Solution {
    public int totalFruit(int[] tree) {
        if (tree == null || tree.length == 0 ) return 0;
        int res = 0;
        int pre = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < tree.length; i++) {
            map.put(tree[i], map.getOrDefault(tree[i], 0) +1);
            
            while (map.size() > 2) {
                map.put(tree[pre], map.get(tree[pre]) -1);
                if (map.get(tree[pre]) == 0) {
                    map.remove(tree[pre]); 
                }
                pre++;
            }
            res = Math.max(res, i - pre + 1);
        }
        return res;
    }
}
