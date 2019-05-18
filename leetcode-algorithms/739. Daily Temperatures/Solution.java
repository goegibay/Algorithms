class Solution {
    public int[] dailyTemperatures(int[] T) {
        if (T == null || T.length == 0) return T;
        int[] res = new int[T.length];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = T.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && T[i] >= T[stack.peek()]) {
                stack.pop();
            }
            res[i] = stack.isEmpty() ? 0 : stack.peek() - i;
            stack.push(i);
        }
        return res;
    }
}
