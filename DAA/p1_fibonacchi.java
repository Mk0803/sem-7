import java.util.Scanner;

public class p1_fibonacchi {
    static int stepCount = 0;

    static int fib(int n) {
        stepCount++; // Counting this function call as a step
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        stepCount = 0;
        int result = fib(n);
        System.out.println("Fibonacci(" + n + ") = " + result);
        System.out.println("Total Steps (Recursive): " + stepCount);
    }
}
