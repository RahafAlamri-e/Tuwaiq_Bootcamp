package week02;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class p1 {
    static Scanner input = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("=== Welcome to X O Game ===");
        System.out.println("How many rounds do you want to play?");

        try {
            int rounds = input.nextInt();

            while (rounds <= 0) {
                System.out.println("Please enter a number greater than 0:");
                rounds = input.nextInt();
            }

            playRounds(rounds);

        } catch (InputMismatchException e) {
            System.out.println("You should enter a number.");
        }
    }

    public static void playRounds(int rounds) {
        int userScore = 0;
        int computerScore = 0;
        int target = rounds / 2 + 1;

        for (int i = 1; i <= rounds; i++) {
            System.out.println("Round " + i + "-----------");

            char[][] board = createBoard();
            displayBoard(board);

            while (true) {
                userPlay(board);
                displayBoard(board);

                if (checkWinner(board, 'X')) {
                    System.out.println("Yaay! You won this round :)");
                    userScore++;
                    break;
                }

                if (isBoardFull(board)) {
                    System.out.println("Draw :(");
                    break;
                }

                computerPlay(board);
                displayBoard(board);

                if (checkWinner(board, 'O')) {
                    System.out.println("Oops :( Computer won this round");
                    computerScore++;
                    break;
                }

                if (isBoardFull(board)) {
                    System.out.println("Draw :(");
                    break;
                }
            }

            System.out.println("\nCurrent Score:");
            System.out.println("User Score: " + userScore);
            System.out.println("Computer Score: " + computerScore);

            if (userScore == target) {
                System.out.println("Congratulations! You are the final winner :)");
                return;
            }

            if (computerScore == target) {
                System.out.println("Computer is the final winner :(");
                return;
            }
        }

        if (userScore > computerScore) {
            System.out.println("Congratulations! You are the final winner :)");
        } else if (computerScore > userScore) {
            System.out.println("Computer is the final winner :(");
        } else {
            System.out.println("The game ended in a draw :(");
        }
    }

    public static char[][] createBoard() {
        char[][] board = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
        return board;
    }

    public static void displayBoard(char[][] board) {
        System.out.println("   0   1   2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + "  ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("  -----------");
            }
        }
        System.out.println();
    }

    public static void userPlay(char[][] board) {
        int userRow, userColumn;

        while (true) {
            try {
                System.out.println("Please choose row (0-2): ");
                userRow = input.nextInt();

                while (userRow < 0 || userRow > 2) {
                    System.out.println("Invalid number, please choose row from 0 to 2: ");
                    userRow = input.nextInt();
                }

                System.out.println("Please choose column (0-2): ");
                userColumn = input.nextInt();

                while (userColumn < 0 || userColumn > 2) {
                    System.out.println("Invalid number, please choose column from 0 to 2:");
                    userColumn = input.nextInt();
                }

                if (board[userRow][userColumn] == ' ') {
                    board[userRow][userColumn] = 'X';
                    System.out.println("Your Play --------");
                    break;
                } else {
                    System.out.println("This position is already taken. Try again.");
                }

            } catch (InputMismatchException e) {
                System.out.println("You should enter a number.");
                input.nextLine();
            }
        }
    }

    public static void computerPlay(char[][] board) {
        int computerRow, computerColumn;

        while (true) {
            computerRow = random.nextInt(3);
            computerColumn = random.nextInt(3);

            if (board[computerRow][computerColumn] == ' ') {
                board[computerRow][computerColumn] = 'O';
                System.out.println("Computer Play --------");
                break;
            }
        }
    }

    public static boolean checkWinner(char[][] board, char symbol) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) {
                return true;
            }
        }

        for (int j = 0; j < 3; j++) {
            if (board[0][j] == symbol && board[1][j] == symbol && board[2][j] == symbol) {
                return true;
            }
        }

        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) {
            return true;
        }

        if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) {
            return true;
        }

        return false;
    }

    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}