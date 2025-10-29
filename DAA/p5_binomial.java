import java.util.Scanner;

public class p5_binomial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter value of r: ");
        int r = sc.nextInt();

        if (r > n) {
            System.out.println("Invalid input: r cannot be greater than n.");
            return;
        }

        int[][] dp = new int[n + 1][r + 1];
        int stepCount = 0;

        // Build DP table using Pascal's rule
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, r); j++) {
                stepCount++;
                if (j == 0 || j == i)
                    dp[i][j] = 1; // Base case
                else
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }

        System.out.println("\nBinomial Coefficient C(" + n + ", " + r + ") = " + dp[n][r]);
        System.out.println("Total Steps (DP iterations): " + stepCount);

        // Optional: print Pascal’s triangle
        System.out.println("\nPascal's Triangle up to row " + n + ":");
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i && j <= r; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }
}
