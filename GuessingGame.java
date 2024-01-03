import java.util.Scanner;
import java.util.Random;

class Game {
    private int noOfGuesses;
    private int number;
    private int userInput;

    public Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100); // Adjust the upper bound as needed
        this.noOfGuesses = 0; // Initialize the number of guesses
    }

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setUserInput(int userInput) {
        this.userInput = userInput;
    }

    public int getUserInput() {
        return userInput;
    }

    public void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        this.userInput = sc.nextInt();
    }

    public boolean isCorrectNumber() {
        noOfGuesses++;
        if (userInput == number) {
            System.out.println("You guessed it right! Attempts: " + noOfGuesses);
            return true;
        } else if (number > userInput) {
            System.out.println("The entered number is less than the actual number.");
        } else {
            System.out.println("The entered number is greater than the actual number.");
        }
        return false;
    }
}

public class GuessingGame {
    public static void main(String[] args) {
        System.out.println("Guessing game");
        boolean b = false;
        int maxAttempts = 10; // Set the maximum number of attempts here

        Game p1 = new Game();

        while (!b && p1.getNoOfGuesses() < maxAttempts) {
            p1.takeUserInput();
            b = p1.isCorrectNumber();
        }

        if (!b) {
            System.out.println("Sorry, you couldn't guess the number in " + maxAttempts + " attempts.");
        }
    }
}
