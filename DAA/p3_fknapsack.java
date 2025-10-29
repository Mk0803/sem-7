import java.util.*;

class Item {
    int weight;
    int profit;
    double ratio; // profit/weight ratio

    Item(int weight, int profit) {
        this.weight = weight;
        this.profit = profit;
        this.ratio = (double) profit / weight;
    }
}

public class p3_fknapsack     {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight and profit for item " + (i + 1) + ": ");
            int weight = sc.nextInt();
            int profit = sc.nextInt();
            items[i] = new Item(weight, profit);
        }

        System.out.print("Enter knapsack capacity: ");
        int capacity = sc.nextInt();

        // Step 1: Sort items by profit/weight ratio in descending order
        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));

        double totalProfit = 0.0;
        int stepCount = 0;
        int remainingCapacity = capacity;

        // Step 2: Pick items greedily
        for (int i = 0; i < n; i++) {
            stepCount++;
            if (items[i].weight <= remainingCapacity) {
                // Take the full item
                remainingCapacity -= items[i].weight;
                totalProfit += items[i].profit;
            } else {
                // Take fractional part of item
                double fraction = (double) remainingCapacity / items[i].weight;
                totalProfit += items[i].profit * fraction;
                remainingCapacity = 0; // Knapsack full
                break;
            }
        }

        // Step 3: Display results
        System.out.println("\nMaximum Profit = " + totalProfit);
        System.out.println("Total Steps (Greedy Operations) = " + stepCount);
    }
}
