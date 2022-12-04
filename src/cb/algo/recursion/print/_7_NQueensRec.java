package cb.algo.recursion.print;

public class _7_NQueensRec {
    public static void main(String[] args) {

        boolean[][] board = new boolean[4][4];
        System.out.println(countNQueens(board,0));
    }

    private static int countNQueens(boolean[][] board, int row) {

        if(row == board.length){
            return 1;
        }

        int count = 0;
        for(int col = 0; col<board[row].length; col++){
            if(isSafe(board,row,col)){
                board[row][col] = true;
                count = count+countNQueens(board, row+1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {

        //check in upper column
        for(int r = row; r >=0; r--){
            if(board[r][col]){
                return false;
            }
        }

        //check left diag
        for(int r = row, c =col; r>=0 && c>=0; r--,c--){
            if(board[r][c]){
                return false;
            }
        }

        //check right diag
        for(int r = row, c= col; r>=0 && c<board[row].length; r--,c++){
            if(board[r][c]){
                return false;
            }
        }

        return true;
    }
}
