import java.util.Scanner;

public class TicTacToe {

    static String[] playerNames;
    static String[] board;


    public static void main(String[] args){
        playerNames = new String[2];
        board = new String[9];

        fillBoard();
        nameRegister();
        printBoard();
//
//        for (int i = 0; i < playerNames.length; i++){
//            System.out.println("Player " + (i+1) + "'s name is: " + playerNames[i]);
//        }

    }

    static void nameRegister(){         //this function stores player names by user input (works fine)
        Scanner nameScan = new Scanner(System.in);

        for (int i = 0; i < playerNames.length; i++){
            System.out.println("Enter name for player " + (i+1) + ": ");
            // add a line of how you would scan the name into the playernames array

        }
    }

    static void fillBoard(){
        for (int i = 0; i < board.length; i++){
            board[i] = String.valueOf(i+1);
        }
    }

    static void printBoard(){      //needs to add border. and last line
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|***********|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|***********|");

    }
}
