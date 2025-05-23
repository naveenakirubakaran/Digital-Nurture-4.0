import java.util.Scanner;

public class RecursiveFibonacci {
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }
}

## Output
  Enter a positive integer: 7
  Fibonacci number at position 7 is: 13
