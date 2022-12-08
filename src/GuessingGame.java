import java.util.Scanner;

public class GuessingGame {
    public static int guess() {
        Scanner input = new Scanner(System.in);
        System.out.print("Guess a number between 1 and 100: ");
        return input.nextInt();
    }

    public static void main() {
        Scanner scanner = new Scanner(System.in);

        int random = (int) (Math.random() * 100);
        boolean True = true;
        while (true) {
            int userGuess = guess();
            if (userGuess == random) {
                System.out.println("You guessed correctly!");
                break;
            } else if (userGuess > random) {
                System.out.println("Your guess is too high!");
            } else {
                System.out.println("Your guess is too low!");
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

