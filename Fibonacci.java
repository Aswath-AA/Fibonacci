public class Fibonacci {

    // Recursive method to calculate nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base cases: fib(0) = 0, fib(1) = 1
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Recursive relation: fib(n) = fib(n-1) + fib(n-2)
        }
    }

    public static void main(String[] args) {
        int n = 10; // Example: find the 10th Fibonacci number
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }
}
