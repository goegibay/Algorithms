class Solution {
    public int leastInterval(char[] tasks, int n) {
        int res = 0;
        int[] count = new int[26];
        
        for (char c: tasks) {
            count[c - 'A']++;
        }
        Arrays.sort(count);
        // (n+1) * (k -1) + p
        int p = 1;
        for (int i =24; i>=0; i--) {
            if (count[i] == count[25]) {
                p++;
            }
        }
        res = (n+1) * (count[25] -1) + p;
        return Math.max(res, tasks.length);
    }
}
