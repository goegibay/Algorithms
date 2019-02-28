class Solution {
    public int hammingDistance(int x, int y) {
        int res = 0;
        while (x > 0 || y > 0) {
            int x2 = x%2;
            int y2 = y%2;
            //System.out.println("x2 = "+x2 + " y2 ="+y2);
            if (x2 != y2) res++;
            
            x /=2;
            y /=2;
            //System.out.println("x = "+x + " y ="+y);
            
        }
        
        return res;
    }
}
