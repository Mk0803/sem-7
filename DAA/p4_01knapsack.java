import java.util.Scanner;

public class p4_01knapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        int[] weight = new int[n + 1];
        int[] profit = new int[n + 1];

        System.out.println("Enter weights of items: ");
        for (int i = 1; i <= n; i++)
            weight[i] = sc.nextInt();

        System.out.println("Enter profits of items: ");
        for (int i = 1; i <= n; i++)
            profit[i] = sc.nextInt();

        System.out.print("Enter knapsack capacity: ");
        int W = sc.nextInt();

        int[][] dp = new int[n + 1][W + 1];
        int stepCount = 0;

        // DP Table Construction
        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= W; w++) {
                stepCount++;
                if (weight[i] <= w)
                    dp[i][w] = Math.max(profit[i] + dp[i - 1][w - weight[i]], dp[i - 1][w]);
                else
                    dp[i][w] = dp[i - 1][w];
            }
        }

        // Output results
        System.out.println("\nMaximum Profit = " + dp[n][W]);
        System.out.println("Total Steps (DP iterations) = " + stepCount);

        // Optional: Print selected items
        System.out.print("Items included: ");
        int w = W;
        for (int i = n; i > 0 && w > 0; i--) {
            if (dp[i][w] != dp[i - 1][w]) {
                System.out.print(i + " ");
                w -= weight[i];
            }
        }
        System.out.println();
    }
}
