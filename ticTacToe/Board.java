package ticTacToe;

public class Board {
    private char[][] board;
    private int size;

    public Board(int size) {
        this.size = size;
        board = new char[size][size];
        initializeBoard();
    }
    private void initializeBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = ' '; // Initialize with empty spaces
            }
        }
    }


    public void display() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j]);
                if (j < size - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
    }

    public boolean isBoardFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == ' ') {
                    return false; 
                }
            }
        }
        return true;
    }

    public boolean isCellEmpty(int row, int col) {
        if (row < 0 || row >= size || col < 0 || col >= size) {
            return false; 
        }
        return board[row][col] == ' '; 
    }

    public boolean checkWin(char symbol) {
        //check row
        for (int i = 0; i < size; i++) {
            boolean rowWin = true;
            for (int j = 0; j < size; j++) {
                if (board[i][j] != symbol) {
                    rowWin = false;
                    break;
                }
            }
            if (rowWin) return true;
        }

        //check column
        for (int j = 0; j < size; j++) {
            boolean colWin = true;
            for (int i = 0; i < size; i++) {
                if (board[i][j] != symbol) {
                    colWin = false;
                    break;      
                }
            }
            if (colWin) return true;
        }

        //check diagonal
        for (int i = 0; i < size; i++) {
            if (board[i][i] != symbol) {
                return false; 
            }
        }

        //check anti-diagonal
        for (int i = 0; i < size; i++) {
            if (board[i][size - 1 - i] != symbol) {
                return false;       
            }
        }
        return false; // No win found
    }
    public boolean placeMark(int row, int col, char symbol) {
        if (row >= 0 && row < size && col >= 0 && col < size && board[row][col] == ' ') {
            board[row][col] = symbol;
            return true;
        }
        return false; // Invalid move
    }
}
