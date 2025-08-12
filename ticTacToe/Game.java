package ticTacToe;

import java.util.Scanner;

public class Game {
    //board rhega
    //2 player rhega
    // symbols rhega customizable
    private Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    //constructor
    public Game(Player player12, Player player1, int boardSize) {
        this.board = new Board(boardSize);
        this.player1 = player1;
        this.player2 = player12;
        this.currentPlayer = player1; // Start with player1
    }

    //start game
    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean gameOngoing = true;
        while(gameOngoing) {
            board.display();

            Move move = currentPlayer.makeMove(board);
            //move k baad jeeta k ni wo check kr lo
            if(board.checkWin(currentPlayer.getSymbol()) == true) {
                board.display();
                System.out.println("Player " + currentPlayer.getSymbol() + " wins!");
                gameOngoing = false;
            } 
            else if (board.isBoardFull()) {
                //if there is no winner and the board is full, it's a draw
                board.display();
                System.out.println("It's a draw!");
                break;
            }
            else {
                // Switch players
                currentPlayer = (currentPlayer == player1) ? player2 : player1;
            }
        }
        scanner.close();
    }

}
