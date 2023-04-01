import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int maxRange = 0;
        int numGuesses = 0;
        int guessLimit = 0;
        
        System.out.println("Welcome to the number guessing game!");
        System.out.println("Choose your difficulty level: ");
        System.out.println("1. Easy (range 1-100, 3 guesses)");
        System.out.println("2. Medium (range 1-500, 3 guesses)");
        System.out.println("3. Hard (range 1-1000, 3 guesses)");
        System.out.print("Enter your choice: ");
        
        int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                maxRange = 50;
                guessLimit = 3;
                break;
            case 2:
                maxRange = 100;
                guessLimit = 3;
                break;
            case 3:
                maxRange = 500;
                guessLimit = 3;
                break;
            default:
                System.out.println("Invalid choice. Please choose again.");
                System.exit(0);
        }
        
        int randomNumber = rand.nextInt(maxRange) + 1;
        
        System.out.println("I'm thinking of a number between 1 and " + maxRange + ". Can you guess it?");
        
        while (numGuesses < guessLimit) {
            System.out.print("Guess #" + (numGuesses + 1) + ": ");
            int guess = sc.nextInt();
            numGuesses++;
            
            if (guess < 1 || guess > maxRange) {
                System.out.println("Invalid guess. Please enter a number between 1 and " + maxRange + ".");
                numGuesses--;
            } else if (guess < randomNumber) {
                System.out.println("Your Guess Number is Smaller! " + (guessLimit - numGuesses) + " guesses left.");
            } else if (guess > randomNumber) {
                System.out.println("Your Guess Number is Greater! " + (guessLimit - numGuesses) + " guesses left.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + numGuesses + " guesses.");
                System.exit(0);
            }
        }
        
        System.out.println("Sorry, you ran out of guesses. The number was " + randomNumber + ".");
    }
}
