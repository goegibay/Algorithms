class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> col = new HashSet<>();
            HashSet<Character> cube = new HashSet<>();

            for (int j =0; j < board[0].length; j++) {
                if (board[i][j] != '.' && !row.add(board[i][j])) return false;
                if (board[j][i] != '.' && !col.add(board[j][i])) return false;
                
                int rowIndex = 3 * (i /3);
                int colIndex = 3 * (i %3);
                
                if (board[rowIndex + (j/3)][colIndex + (j%3)] != '.' && !cube.add(board[rowIndex + (j/3)][colIndex + (j%3)])) return false;
                
            }
        }
        return true;
    }
}
