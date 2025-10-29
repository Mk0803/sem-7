import java.util.*;

class Job {
    char id;        // Job ID (like A, B, C...)
    int deadline;   // Deadline of job
    int profit;     // Profit if job is done before or on deadline

    Job(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class p2_job {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of jobs: ");
        int n = sc.nextInt();

        Job[] jobs = new Job[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Job ID, Deadline, Profit: ");
            char id = sc.next().charAt(0);
            int deadline = sc.nextInt();
            int profit = sc.nextInt();
            jobs[i] = new Job(id, deadline, profit);
        }

        // Step 1: Sort jobs in decreasing order of profit
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        // Step 2: Find the maximum deadline to define the time slots
        int maxDeadline = 0;
        for (Job job : jobs) {
            if (job.deadline > maxDeadline)
                maxDeadline = job.deadline;
        }

        // Step 3: Create a slot array to keep track of free time slots
        char[] result = new char[maxDeadline + 1]; // 1-based indexing
        boolean[] slot = new boolean[maxDeadline + 1];

        int totalProfit = 0;
        int stepCount = 0;

        // Step 4: Assign jobs to slots (latest possible before deadline)
        for (Job job : jobs) {
            for (int j = job.deadline; j > 0; j--) {
                stepCount++;
                if (!slot[j]) {
                    slot[j] = true;
                    result[j] = job.id;
                    totalProfit += job.profit;
                    break;
                }
            }
        }

        // Step 5: Print results
        System.out.println("\nJob Sequence (Greedy Order): ");
        for (int i = 1; i <= maxDeadline; i++) {
            if (slot[i]) System.out.print(result[i] + " ");
        }

        System.out.println("\nTotal Profit: " + totalProfit);
        System.out.println("Step Count: " + stepCount);
    }
}
