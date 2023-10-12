public class Leetcode {
    public static boolean boardSlover(char board[][], int row,int col) {
        // base case
        if (row == 9 && col == 0) {
            return true;
        } else if (row == 9) {
            return false;
        }

        // recursion
        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }
        if (board[row][col] != 0) {
            return boardSlover(board, nextRow, nextCol);

        }
        for (char digit = '1'; digit <= '9'; digit++) {
            if (isSafe(board, row, col, digit)) {
                board[row][col] = digit;
                if (boardSlover(board, nextRow, nextCol)) {
                    return true;
                }
                board[row][col] = 0;
            }
        }
        return false;
    }
    public static boolean isSafe(char board[][], int row, int col, char digit) {
        for (int i = 0; i <= 8; i++) {
            if (board[row][i] == digit) {
                return false;
            }
        }
        for (int i = 0; i <= 8; i++) {
            if (board[i][col] == digit) {
                return false;
            }
        }

        // grid
        int sr = (row / 3) * 3;

        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[sr][sc] == digit) {
                    return false;
                }
            }
        }

        return true;

    }
    public static void  printSudoku(char board[][]){
        for(int i = 0; i< board.length; i++){
            for(int j =0; j <board.length; j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }
   public static void main(String[] args) {
     char board[][] = {{'5','3','.','.','7','.','.','.','.'},
    {'6','.','.','1','9','5','.','.','.'},
    {'.','9','8','.','.','.','.','6','.'},
    {'8','.','.','.','6','.','.','.','3'},
    {'4','.','.','8','.','3','.','.','1'},
    {'7','.','.','.','2','.','.','.','6'},
    {'.','6','.','.','.','.','2','8','.'},
    {'.','.','.','4','1','9','.','.','5'},
    {'.','.','.','.','8','.','.','7','9'}};
    
    System.out.println(boardSlover(board, 0, 0));
    boardSlover(board, 0, 0);
   


   }
}
