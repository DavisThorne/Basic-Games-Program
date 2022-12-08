import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to do: ");
        System.out.println("1. Play Guessing Game \n2. Play Rock Paper Scissors \n3. Play Tic Tac Toe\n0. Exit");
        String playGame = scanner.nextLine();
        switch (playGame) {
            case "1" -> GuessingGame.main();
            case "2" -> RockPaperScissors.main();
            case "3" -> TicTacToe.main();
            case "0" -> System.exit(0);
            default -> {
                System.out.println("Invalid input");
                main(new String[]{""});
            }
        }
    }
}


