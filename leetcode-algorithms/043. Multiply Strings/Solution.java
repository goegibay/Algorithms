class Solution {
    public String multiply(String num1, String num2) {
        if (num1 == "0" || num2 == "0") return "0";
        
        int[] array = new int[num1.length() + num2.length()];
        for (int i=0; i < array.length; i++) {
            array[i] = 0;
        }
        
        char[] ca1 = num2.toCharArray();
        
        
        char[] ca2 = num1.toCharArray();
        System.out.println("ca2 = "+ ca2[0]);
        for (int i = ca2.length -1; i >= 0; i--) {
            int n2 = ca2[i] - '0';
            for (int j = ca1.length -1; j >= 0; j--) {
                int n1 = ca1[j] -'0';
                int product = n1 * n2;
                
                int index = 0;
                while (product > 0) {
                    System.out.println("i: "+ i +" j: "+j +" index: " +index);
                    array[i+j -index +1] += product %10;
                    product /= 10;
                    index++;
                }
            }  
        }
        System.out.println("array = "+ array[0]);
        String res = "";
        boolean isNonZeroHead = false;
        for (int i = 0; i < array.length; i++) {
            if (isNonZeroHead || array[i] != 0) {
                res += array[i];
                isNonZeroHead = true;
            }
        }
        return res;
    }
}
