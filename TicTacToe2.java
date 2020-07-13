import java.util.Scanner;

public class TicTacToe2 {

    static String[] playerNames;
    static String[] board;
    static boolean winner;
    static String turn;
    static int playerTurn;

    public static void main(String[] args){
        playerNames = new String[2];
        board = new String[9];
        winner = false;
        turn = "X";

        fillBoard();

        System.out.println("Welcome to 2 player TicTacToe: Please enter Player Names: ");
        nameRegister();
        printBoard();

        playerTurn = 0;
        int i =0;
        Scanner boardScanner = new Scanner(System.in);


        while(winner == false) {     //runs until winner case reached.

            System.out.println("Its " + playerNames[playerTurn] + "'s turn, select a square to place " + turn);
            int boardPosition = boardScanner.nextInt();
            board[boardPosition-1] = turn;      //stores turn symbol (X or O) in the chosen square.

            checkWinner();

            //needs to update the turn symbol, if its X player, make it O's turn and vice versa.
            if (playerTurn == 0){
                playerTurn++;
                turn = "O";
            }else {
                playerTurn = 1;
                turn = "X";
            }

        }
//
//        for (int i = 0; i < playerNames.length; i++){
//            System.out.println("Player " + (i+1) + "'s name is: " + playerNames[i]);
//        }

    }

    static void checkWinner(){      //needs to finish all the winning cases, 8 in total!
        String line = "";
        for (int a = 0; a < 9; a++){
            switch(a){
                case 0:
                    line = board[0]+board[1]+board[2];
                    break;

                case 1:
                    line = board[3]+board[4]+board[5];
                    break;

                case 2:     //diagonal case from top left to bottom right
                    line = board[0]+board[4]+board[8];
                    break;

            }

            line = line.trim();

            //if statements checking if the a winner case is found.
            if (line.equalsIgnoreCase("XXX") || line.equalsIgnoreCase("OOO")){
                printBoard();
                winner = true;
                System.out.println("Congratulations! " + playerNames[playerTurn] + " has won!");
                return;
            }
        }
        printBoard();
    }

    static void nameRegister(){         //this function stores player names by user input (works fine)
        Scanner nameScan = new Scanner(System.in);

        for (int i = 0; i < playerNames.length; i++){
            System.out.println("Enter name for player " + (i+1) + ": ");
            playerNames[i] = nameScan.nextLine();
            // add a line of how you would scan the name into the playernames array
        }
    }

    static void fillBoard(){
        for (int i = 0; i < boardx.length; i++){
            board[i] = String.valueOf(i+1);
        }
    }

    static void printBoard(){      //needs to add border. and last line
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|***********|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|***********|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
    }
}
