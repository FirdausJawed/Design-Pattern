package ticTacToe;

import java.util.Scanner;

public class Player {
    private String name;
    private char symbol; 
    private Scanner scanner = new Scanner(System.in);

    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }
    
    public Move makeMove(Board board) {
        boolean validMove = false;
        int row = -1, col = -1;
        while (!validMove) {
            System.out.println(name + ", enter your move (row and column): ");
            row = scanner.nextInt();
            col = scanner.nextInt();
            if (board.placeMark(row, col, getSymbol())) {
                break; // Valid move
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
        return new Move(row, col, this);
    }

}
