class Solution {
    public String decodeString(String s) {
        if (s == null || s.length() == 0) return s;
        Stack<Integer> countStack = new Stack<>();
        Stack<String> resStack = new Stack<>();
        String res = "";
        int index = 0;
        
        while (index < s.length()) {
            if (Character.isDigit(s.charAt(index))) {
                int count = 0;
                while (Character.isDigit(s.charAt(index))) {
                    count = count * 10 + (s.charAt(index) - '0');
                    index++;
                }
                countStack.push(count);
                
            } else if (s.charAt(index) == '[') {
                resStack.push(res);
                res = "";
                index++;
            } else if (s.charAt(index) == ']') {
                int time = countStack.pop();
                StringBuilder temp = new StringBuilder(resStack.pop());
                for (int i = 0; i < time; i++) {
                    temp.append(res);
                }
                res = temp.toString();
                index++;
                
            } else {
                res += s.charAt(index);
                index++;
            }
        }
        
        return res;
    }
}
