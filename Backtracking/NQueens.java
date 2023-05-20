public class NQueens {
    public static void Solution(char[][] board, int row) {
        // base
        if (row == board.length) {
            printBoard(board);
            count++;
            return;
        }

        // Column Loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                Solution(board, row + 1); // Function calling
                board[row][j] = 'x'; // backtracing step
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        // Vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diag left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diag right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void printBoard(char[][] board) {
        System.out.println("____________Chess Board____________");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean trueOrFalse(char[][] board, int row) {
        // base
        if (row == board.length) {
            return true;
        }

        // Column Loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (trueOrFalse(board, row + 1)) {
                    return true;
                }
                board[row][j] = 'x'; // backtracing step
            }
        }

        return false;
    }

    public static int count = 0;

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'x';
            }
        }

        Solution(board, 0);
        System.out.println();
        System.out.println();

        System.out.println("Total ways to solve N Queens = " + count);

        System.out.println();
        System.out.println();

        if (trueOrFalse(board, 0)) {
            System.out.println("Solution is possible");
            System.out.println();
            printBoard(board);
        } else {
            System.out.println("Solution is not possible");
        }
    }
}
