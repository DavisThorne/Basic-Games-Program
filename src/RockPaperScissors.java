import java.util.Scanner;

public class RockPaperScissors {

    public static String choice() {
        Scanner input = new Scanner(System.in);
        System.out.print("Rock, Paper, or Scissors? ");
        return input.nextLine();
    }

    public static String computerChoice() {
        int random = (int) (Math.random() * 3);
        if (random == 0) {
            return "Rock";
        } else if (random == 1) {
            return "Paper";
        } else {
            return "Scissors";
        }
    }

    public static void main() {
        Scanner scanner = new Scanner(System.in);

        String userChoice = choice();
        String computerChoice = computerChoice();
        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (userChoice.equals("Rock")) {
            if (computerChoice.equals("Scissors")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        } else if (userChoice.equals("Paper")) {
            if (computerChoice.equals("Rock")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        } else if (userChoice.equals("Scissors")) {
            if (computerChoice.equals("Paper")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }

        //return to Main Class
        System.out.println("Would you like to play again? (y/n)");
        String playAgain = scanner.nextLine();
        if (playAgain.equals("n")) {
            Main.main(new String[]{""});
        } else {
            main();
        }
    }


}
