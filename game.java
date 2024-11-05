import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};
        int playerScore = 0;
        int computerScore = 0;

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Let's play! Enter 'Rock', 'Paper', or 'Scissors'. Type 'Exit' to quit.");

        while (true) {
            System.out.print("Your move: ");
            String playerMove = scanner.nextLine();

            if (playerMove.equalsIgnoreCase("Exit")) {
                System.out.println("Final Score - You: " + playerScore + " | Computer: " + computerScore);
                System.out.println("Thanks for playing!");
                break;
            }

            if (!playerMove.equalsIgnoreCase("Rock") && 
                !playerMove.equalsIgnoreCase("Paper") && 
                !playerMove.equalsIgnoreCase("Scissors")) {
                System.out.println("Invalid move! Please enter Rock, Paper, or Scissors.");
                continue;
            }

            int computerChoice = random.nextInt(3);
            String computerMove = choices[computerChoice];
            System.out.println("Computer chose: " + computerMove);

            if (playerMove.equalsIgnoreCase(computerMove)) {
                System.out.println("It's a tie!");
            } else if (playerMove.equalsIgnoreCase("Rock") && computerMove.equals("Scissors") ||
                       playerMove.equalsIgnoreCase("Paper") && computerMove.equals("Rock") ||
                       playerMove.equalsIgnoreCase("Scissors") && computerMove.equals("Paper")) {
                System.out.println("You win this round!");
                playerScore++;
            } else {
                System.out.println("Computer wins this round!");
                computerScore++;
            }

            System.out.println("Score - You: " + playerScore + " | Computer: " + computerScore);
            System.out.println();
        }
    }
}
