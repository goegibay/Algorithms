class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] paths = path.split("/+");
        
        for (String word : paths) {
            if (word.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!word.equals("") && !word.equals(".")) {
                stack.push(word);
            }
        }
        String res = "";
        while (!stack.isEmpty()) {
            res =  '/' + stack.pop() + res;
        }
        if (res.length() == 0) {
            res = "/";
        }
        return res;
    }
}
