import java.util.Scanner;

public class TicTacToeMary {

    static String[] playerNames;
    static int[] playerScores;
    static boolean winner;
    static int playerTurn;
    int row, col;

    public static void printBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void nameRegister() {         //this function stores player names by user input (works fine)
        Scanner nameScan = new Scanner(System.in);

        for (int i = 0; i < playerNames.length; i++) {
            System.out.println("Enter name for player " + (i + 1) + ": ");
            playerNames[i] = nameScan.nextLine();
            // add a line of how you would scan the name into the player names array
        }
    }

    public static void fillBoard(int playerTurn, int position, char[][] gameBoard) {

        char character;

        if (playerTurn == 1) {
            character = 'X';
        } else {
            character = 'O';
        }

        switch (position) {
            case 1:
                gameBoard[0][0] = character;
                printBoard(gameBoard);
                break;
            case 2:
                gameBoard[0][2] = character;
                printBoard(gameBoard);
                break;
            case 3:
                gameBoard[0][4] = character;
                printBoard(gameBoard);
                break;
            case 4:
                gameBoard[1][0] = character;
                printBoard(gameBoard);
                break;
            case 5:
                gameBoard[1][2] = character;
                printBoard(gameBoard);
                break;
            case 6:
                gameBoard[1][4] = character;
                printBoard(gameBoard);
                break;
            case 7:
                gameBoard[2][0] = character;
                printBoard(gameBoard);
                break;
            case 8:
                gameBoard[2][2] = character;
                printBoard(gameBoard);
                break;
            case 9:
                gameBoard[2][4] = character;
                printBoard(gameBoard);
                break;
            default:
                break;
        }
    }

    /// issues of overriding the code when 9 is given twice
    /// basically i want it to say input of out bounds when < 1 and > 9 are put in
    /// and then check for validation
    ///if everything is fine keep going

    public static void askPlayer1(char[][] gameBoard) {
        boolean h = true;
        boolean b = true;

        System.out.printf("Player %s Please enter a number between 1-9: ", playerNames[0]);
        Scanner boardScanner_1 = new Scanner(System.in);
        int value = boardScanner_1.nextInt();

        b = bounds(value, gameBoard);
        if (b == false) {
            while (b != true) {
                System.out.println(' ');
                System.out.printf("Input is invalid. Please enter a number between 1-9 that's not already taken, Player %s", playerNames[0]);
                System.out.println(' ');
                value = boardScanner_1.nextInt();
                b = bounds(value, gameBoard);
            }
        }

        h = validation(value, gameBoard);
        if (h == false) {
            while (h != true) {
                System.out.println("Position " + value + " already contains a value, please enter another number : ");
                value = boardScanner_1.nextInt();
                h = validation(value, gameBoard);
            }
        }
        fillBoard(1, value, gameBoard);
    }

    public static void askPlayer2(char[][] gameBoard) {
        boolean h = true;
        boolean b = true;

        System.out.printf("Player %s Please enter a number between 1-9: ", playerNames[1]);
        Scanner boardScanner_2 = new Scanner(System.in);
        int value = boardScanner_2.nextInt();

        b = bounds(value, gameBoard);
        if (b == false) {
            while (b != true) {
                System.out.println(' ');
                System.out.printf(" ", playerNames[1]);
                System.out.println(' ');
                System.out.printf("Input is invalid. Please enter a number between 1-9 that's not already taken, Player %s", playerNames[0]);
                System.out.println(' ');
                value = boardScanner_2.nextInt();
                b = bounds(value, gameBoard);
            }
        }

        h = validation(value, gameBoard);
        if (h == false) {
            while (h != true) {
                System.out.println("Position " + value + " already contains a value, please enter another number : ");
                value = boardScanner_2.nextInt();
                h = validation(value, gameBoard);
            }
        }

        fillBoard(2, value, gameBoard);
    }

    // need to combine bounds and validation
    public static boolean bounds(int value, char[][] gameBoard) {
        if (value >= 1 && value <= 9) {
            return true;
        } else
            return false;
    }

    public static boolean validation(int value, char[][] gameBoard) {

        switch (value) {

            case 1:

                if (gameBoard[0][0] == '_') {
                    return true;
                } else {
                    return false;
                }
            case 2:
                if (gameBoard[0][2] == '_') {
                    return true;
                } else {
                    return false;
                }
            case 3:
                if (gameBoard[0][4] == '_') {
                    return true;
                } else {
                    return false;
                }
            case 4:
                if (gameBoard[1][0] == '_') {
                    return true;
                } else {
                    return false;
                }
            case 5:
                if (gameBoard[1][2] == '_') {
                    return true;
                } else {
                    return false;
                }
            case 6:
                if (gameBoard[1][4] == '_') {
                    return true;
                } else {
                    return false;
                }
            case 7:
                if (gameBoard[2][0] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case 8:
                if (gameBoard[2][2] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case 9:
                if (gameBoard[2][4] == ' ') {
                    return true;
                } else {
                    return false;
                }
            default:
                return false;
        }
    }

    // check winner

    public static boolean checkWinner(char[][] gameBoard) {
        //Vertically checks for winners
        if (gameBoard[0][0] == 'X' && gameBoard[1][0] == 'X' && gameBoard[2][0] == 'X') {
            System.out.printf("Winner has been found! Well Done Player %s!", playerNames[0]);
            System.out.println(' ');
            playerScores[0]++;
            return true;
        }

        if (gameBoard[0][0] == 'O' && gameBoard[1][0] == 'O' && gameBoard[2][0] == 'O') {
            System.out.printf("Winner has been found! Well Done Player %s!", playerNames[1]);
            System.out.println(' ');
            playerScores[1]++;
            return true;
        }

        if (gameBoard[0][2] == 'X' && gameBoard[1][2] == 'X' && gameBoard[2][2] == 'X') {
            System.out.printf("Winner has been found! Well Done Player %s!", playerNames[0]);
            System.out.println(' ');
            playerScores[0]++;
            return true;
        }

        if (gameBoard[0][2] == 'O' && gameBoard[1][2] == 'O' && gameBoard[2][2] == 'O') {
            System.out.printf("Winner has been found! Well Done Player %s!", playerNames[1]);
            System.out.println(' ');
            playerScores[1]++;
            return true;
        }
        if (gameBoard[0][4] == 'X' && gameBoard[1][4] == 'X' && gameBoard[2][4] == 'X') {
            System.out.printf("Winner has been found! Well Done Player %s!", playerNames[0]);
            System.out.println(' ');
            playerScores[0]++;
            return true;
        }
        if (gameBoard[0][4] == 'O' && gameBoard[1][4] == 'O' && gameBoard[2][4] == 'O') {
            System.out.printf("Winner has been found! Well Done Player %s!", playerNames[1]);
            System.out.println(' ');
            playerScores[1]++;
            return true;
        }

        //Diagonally checks for winners
        if (gameBoard[0][0] == 'X' && gameBoard[1][2] == 'X' && gameBoard[2][4] == 'X') {
            System.out.printf("Winner has been found! Well Done Player %s!", playerNames[0]);
            System.out.println(' ');
            playerScores[0]++;
            return true;
        }

        if (gameBoard[0][0] == 'O' && gameBoard[1][2] == 'O' && gameBoard[2][4] == 'O') {
            System.out.printf("Winner has been found! Well Done Player %s!", playerNames[1]);
            System.out.println(' ');
            playerScores[1]++;
            return true;
        }

        if (gameBoard[2][0] == 'X' && gameBoard[1][2] == 'X' && gameBoard[0][4] == 'X') {
            System.out.printf("Winner has been found! Well Done Player %s!", playerNames[0]);
            System.out.println(' ');
            playerScores[0]++;
            return true;
        }

        if (gameBoard[2][0] == 'O' && gameBoard[1][2] == 'O' && gameBoard[0][4] == 'O') {
            System.out.printf("Winner has been found! Well Done Player %s!", playerNames[1]);
            System.out.println(' ');
            playerScores[1]++;
            return true;
        }

        //Horizontally checks for winners
        if (gameBoard[0][0] == 'X' && gameBoard[0][2] == 'X' && gameBoard[0][4] == 'X') {
            System.out.printf("Winner has been found! Well Done Player %s!", playerNames[0]);
            System.out.println(' ');
            playerScores[0]++;
            return true;
        }

        if (gameBoard[0][0] == 'O' && gameBoard[0][2] == 'O' && gameBoard[0][4] == 'O') {
            System.out.printf("Winner has been found! Well Done Player %s!", playerNames[1]);
            System.out.println(' ');
            playerScores[1]++;
            return true;
        }

        if (gameBoard[1][0] == 'X' && gameBoard[1][2] == 'X' && gameBoard[1][4] == 'X') {
            System.out.printf("Winner has been found! Well Done Player %s!", playerNames[0]);
            System.out.println(' ');
            playerScores[0]++;
            return true;
        }
        if (gameBoard[1][0] == 'O' && gameBoard[1][2] == 'O' && gameBoard[1][4] == 'O') {
            System.out.printf("Winner has been found! Well Done Player %s!", playerNames[1]);
            System.out.println(' ');
            playerScores[1]++;
            return true;
        }
        if (gameBoard[2][0] == 'X' && gameBoard[2][2] == 'X' && gameBoard[2][4] == 'X') {
            System.out.printf("Winner has been found! Well Done Player %s!", playerNames[0]);
            System.out.println(' ');
            playerScores[0]++;
            return true;
        }
        if (gameBoard[2][0] == 'O' && gameBoard[2][2] == 'O' && gameBoard[2][4] == 'O') {
            System.out.printf("Winner has been found! Well Done Player %s!", playerNames[1]);
            System.out.println(' ');
            playerScores[1]++;
            return true;
        }
        // considering the case where there is a draw
        if (gameBoard[0][0] != '_' && gameBoard[0][2] != '_' && gameBoard[0][4] != '_' && gameBoard[1][0] != '_'
                && gameBoard[1][2] != '_' && gameBoard[1][4] != '_' && gameBoard[2][0] != ' ' && gameBoard[2][2] != ' '
                && gameBoard[2][4] != ' ') {
            System.out.println("A draw has occurred");

            return true;
        }
        return false;
    }

    public static void resetGame(char[][] gameBoard) {
        gameBoard[0][0] = '_';
        gameBoard[0][2] = '_';
        gameBoard[0][4] = '_';
        gameBoard[1][0] = '_';
        gameBoard[1][2] = '_';
        gameBoard[1][4] = '_';
        gameBoard[2][0] = ' ';
        gameBoard[2][2] = ' ';
        gameBoard[2][4] = ' ';
    }


    public static void main(String[] args) {
        playerNames = new String[2];
        playerScores = new int[2];
        boolean winner = false;
        boolean playAgain = true;
        Scanner boardScanner_1 = new Scanner(System.in);
        Scanner boardScanner_2 = new Scanner(System.in);

        System.out.println("Welcome to 2 player TicTacToe: Please enter Player Names: ");
        // building the tic tac toe board
        // want it in the form

        //       ____ | ____ | ____
        //       ____ | ____ | ____
        //            |      |

        char[][] gameBoard = {{'_', '|', '_', '|', '_'}, {'_', '|', '_', '|', '_'}, {' ', '|', ' ', '|', ' '}};
        nameRegister();

        //while loop needed here :)...need to check winner
        // keeps looking for player 2 to answer....fixed
        while (playAgain) {
            while (!winner) {
                askPlayer1(gameBoard);
                winner = checkWinner(gameBoard);
                if (winner) {
                    break;
                }

                askPlayer2(gameBoard);
                winner = checkWinner(gameBoard);
                if (winner) {
                    break;

                }
            }

            for (int i = 0; i<playerScores.length;i++){
                System.out.println("Player " + playerNames[i] + "'s score is: " + playerScores[i]);
            }

            System.out.println("Do you to continue Y/N: ");
            String reply = boardScanner_1.nextLine();

            switch (reply.trim()) {
                case "Y":
                case "y":
                    playAgain = true;
                    System.out.println("Yay!! Let's play again!");
                    resetGame(gameBoard);
                    winner = false;
                    break;

                case "N":
                case "n":
                    playAgain = false;
                    System.out.println("Thank you for playing! Hope you had fun!");
                    break;

                default:
                    System.out.println("invalid choice");
                    break;
            }

            }
        }
    }

// numbers only should be inputted
// should not input 08h hh ; tg9