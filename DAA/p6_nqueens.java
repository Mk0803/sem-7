import java.util.Scanner;

public class p6_nqueens {
    static final int N = 8;
    static int stepCount = 0;

    // Function to print the chessboard
    static void printBoard(int[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function to check if placing a queen at (row, col) is safe
    static boolean isSafe(int[][] board, int row, int col) {
        stepCount++;
        int i, j;

        // Check the left side of the same row
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        // Check upper-left diagonal
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        // Check lower-left diagonal
        for (i = row, j = col; j >= 0 && i < N; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    // Recursive function to solve the 8-Queens problem
    static boolean solveQueens(int[][] board, int col) {
        // Base case: if all queens are placed
        if (col >= N)
            return true;

        // Try placing this queen in all rows one by one
        for (int i = 0; i < N; i++) {
            if (isSafe(board, i, col)) {
                board[i][col] = 1;

                // Recur to place the rest of the queens
                if (solveQueens(board, col + 1))
                    return true;

                // Backtrack
                board[i][col] = 0;
            }
        }

        return false; // No safe position found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[N][N];

        // Take first queen's position
        System.out.print("Enter position of first Queen (row and column 0-7): ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        // Place the first queen
        board[row][col] = 1;

        // Start from next column
        if (!solveQueens(board, col + 1)) {
            System.out.println("Solution does not exist.");
        } else {
            System.out.println("\nFinal 8-Queens Matrix:");
            printBoard(board);
            System.out.println("\nTotal Steps (isSafe checks): " + stepCount);
        }
    }
}
