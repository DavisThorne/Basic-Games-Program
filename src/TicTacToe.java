import java.util.Scanner;

public class TicTacToe {

    public static void main(){
        //Build Tic Tac Toe Board
        String[][] board = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = " ";
            }
        }

        //Print Board
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + board[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("-------------");

        //Play Game
        Scanner scanner = new Scanner(System.in);
        boolean True = true;
        while (True) {
            System.out.print("Enter a row (0, 1, or 2) for player X: ");
            int row = scanner.nextInt();
            System.out.print("Enter a column (0, 1, or 2) for player X: ");
            int column = scanner.nextInt();
            board[row][column] = "X";
            for (int i = 0; i < 3; i++) {
                System.out.println("-------------");
                for (int j = 0; j < 3; j++) {
                    System.out.print("| " + board[i][j] + " ");
                }
                System.out.println("|");
            }
            System.out.println("-------------");
            System.out.println("Computer is Playing...");
            row = (int) (Math.random() * 3);
            column = (int) (Math.random() * 3);
            board[row][column] = "O";
            for (int i = 0; i < 3; i++) {
                System.out.println("-------------");
                for (int j = 0; j < 3; j++) {
                    System.out.print("| " + board[i][j] + " ");
                }
                System.out.println("|");
            }
            System.out.println("-------------");
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
