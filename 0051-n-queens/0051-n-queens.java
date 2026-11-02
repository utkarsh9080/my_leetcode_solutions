// class Solution {
//     public List<List<String>> solveNQueens(int n) {
//         int[][] board = new int[n][n];
//         solve(0,n,board);
//         return board;
//     }
//     public static boolean solve(int row,int n,int[][] board){
//         if(row==n){
//             return true;
//         }
//         for(int col =0;col<n;col++){
//             if(isSafe(row , col , n , board)){
//                 board[row][col]=1;
//                 if(solve(row+1,n,board)){
//                     return true;
//                 }
//                 board[row][col]=0;
//             }
//         }
//         return false;
//     } 
//     public static boolean isSafe(int row , int col , int n , int[][] borad){
//         for(int i =0;i<row;i++){
//             if(board[i][col]==1){
//                 return false;
//             }
//         }
//         for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
//             if(board[i][j]==1){
//                 return false;
//             }
//         }
//         return true;
//     }
// }

class Solution {
    List<List<String>> ans = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        int[][] board = new int[n][n];
        solve(0, n, board);
        return ans;
    }

    public void solve(int row, int n, int[][] board) {
        if (row == n) {
            List<String> temp = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                StringBuilder s = new StringBuilder();

                for (int j = 0; j < n; j++) {
                    if (board[i][j] == 1)
                        s.append('Q');
                    else
                        s.append('.');
                }

                temp.add(s.toString());
            }

            ans.add(temp);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, n, board)) {
                board[row][col] = 1;
                solve(row + 1, n, board);
                board[row][col] = 0;
            }
        }
    }

    public boolean isSafe(int row, int col, int n, int[][] board) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1)
                return false;
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1)
                return false;
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1)
                return false;
        }

        return true;
    }
}
