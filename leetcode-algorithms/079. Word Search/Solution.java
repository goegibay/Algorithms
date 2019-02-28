ass Solution {
    public boolean exist(char[][] board, String word) {
        if (board.length == 0 || word.length() ==0) {
            return false;
        }
        boolean found = false;
        for(int i=0; i < board.length && !found; i++) {
            for(int j=0; j < board[i].length && !found; j++) {
                found = search(board, word,0, i, j);
            }
        }
        return found;
    }

    // d: searched char pos
    private boolean search(char[][] board, String word, int d, int x, int y) {
        if (d >= word.length()) {
            return true;
        }
        if (x < 0 || x >= board.length || y < 0 || y >= board[x].length || board[x][y] == '-' ) {
            return false;
        }
        if (board[x][y] != word.charAt(d)) {
            return false;
        }

        char tmp = board[x][y];
        board[x][y] = '-';
        boolean result = search(board, word, d+1, x+1, y) 
            || search(board, word, d+1, x-1, y) 
            || search(board, word, d+1, x, y+1) 
            || search(board, word, d+1, x, y-1);
        board[x][y] = tmp;
        
        return result;
    }
}
