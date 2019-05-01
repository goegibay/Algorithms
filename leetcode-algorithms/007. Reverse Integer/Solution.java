class Solution {
    public int reverse(int x) {
        long res = 0;
        
        while(x != 0) {
            int c = x % 10;
            x = x /10;
            res = res * 10 + c; 
            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ) return 0;
        }
        return (int) res;
    }
}
