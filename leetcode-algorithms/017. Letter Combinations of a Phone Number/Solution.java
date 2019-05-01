class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0) return res;
        String[] letters = {"" , "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        helper(res, "", digits, letters, 0);
        
        return res; 
    }
    
    public void helper(List<String> res, String string, String digits, String[] letters, int index) {
        if (index ==  digits.length()) {
            res.add(string);
            return;
        }
        
        int num = digits.charAt(index) - '0';
        String letter = letters[num];
        for (int i = 0; i < letter.length(); i++) {
            helper(res, string + letter.charAt(i), digits, letters, index+1);
        }
    }
}
