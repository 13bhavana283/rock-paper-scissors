import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        String[] choices = {"Rock", "Paper", "Scissors"};

        System.out.println("Welcome to Rock, Paper, Scissors Game!");
        System.out.println("======================================");
        System.out.println("Rules:");
        System.out.println("1. Rock beats Scissors");
        System.out.println("2. Scissors beats Paper");
        System.out.println("3. Paper beats Rock");
        System.out.println("--------------------------------------");

        String playAgain;

        do {
            System.out.println("\nChoose your option:");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.print("Enter your choice (1-3): ");
            int userChoice = input.nextInt();

            if (userChoice < 1 || userChoice > 3) {
                System.out.println("Invalid choice! Please enter a number between 1 and 3.");
                continue;
            }

            int compChoice = rand.nextInt(3) + 1;

            System.out.println("You chose: " + choices[userChoice - 1]);
            System.out.println("Computer chose: " + choices[compChoice - 1]);

            // Determine the winner
            if (userChoice == compChoice) {
                System.out.println("It's a draw!");
            } else if ((userChoice == 1 && compChoice == 3) ||
                       (userChoice == 2 && compChoice == 1) ||
                       (userChoice == 3 && compChoice == 2)) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }

            // Ask to play again
            System.out.print("\nDo you want to play again? (yes/no): ");
            playAgain = input.next().toLowerCase();
        } while (playAgain.equals("yes"));

        System.out.println("Thanks for playing! Goodbye.");
        input.close();
    }
}
