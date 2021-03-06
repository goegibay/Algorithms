ass Solution {
    public boolean isStrobogrammatic(String num) {
        // 6 <-> 9 8<->8 0 <-> 0
        if (num == null || num.length() == 0) return true;
        HashMap<Character, Character> map = new HashMap<>();
        map.put('6' , '9');
        map.put('9' , '6');
        map.put('0' , '0');
        map.put('8' , '8');
        map.put('1' , '1');
        
        int left = 0;
        int right = num.length() -1;
        
        while (left <= right) {
            if (!map.containsKey(num.charAt(left))) {
                return false;
            }
            if (num.charAt(right) != map.get(num.charAt(left))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
