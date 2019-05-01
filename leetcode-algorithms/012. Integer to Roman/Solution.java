class Solution {
    public String intToRoman(int num) {
        //1000, 900, 500, 400, 100, 90, 50, 40, 10,  9, 5, 4, 1
        //   M,  CM,  D,   CD,   C, XC,  L, XL,  X, IX, V, IV, I
        int[] ints = {1000, 900, 500, 400, 100, 90, 50, 40, 10,  9, 5, 4, 1};
        String[] roman = {"M",  "CM",  "D", "CD",  "C", "XC",  "L", "XL",  "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new  StringBuilder("");
        
        for (int i = 0; i< ints.length; i++) {
            while(num >= ints[i]) {
                sb.append(roman[i]);
                num -= ints[i];
            }
        }
        return sb.toString();
    }
}
