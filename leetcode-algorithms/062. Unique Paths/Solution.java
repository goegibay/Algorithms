class Solution {
    public int uniquePaths(int m, int n) {
        int count = m + n - 2;
        int k = m - 1;
        double res = 1;
        
        for (int i = 1; i <= k; i++) {
            res = res * (count -k + i) / i;
        }
        
        return (int) res;
    }
}
