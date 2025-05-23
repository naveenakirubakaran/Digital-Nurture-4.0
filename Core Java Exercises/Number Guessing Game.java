import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        int guess;

        System.out.println("Guess the number between 1 and 100");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Correct! You guessed it!");
            }

        } while (guess != numberToGuess);
    }
}

Output
Guess the number between 1 and 100
Enter your guess: 50
Too low! Try again.
Enter your guess: 75
Too high! Try again.
Enter your guess: 63
Correct! You guessed it!
