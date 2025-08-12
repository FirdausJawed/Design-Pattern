package ticTacToe;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter player 1 name: ");
        String player1Name = scanner.nextLine();
        System.out.print("Enter player 2 name: ");
        String player2Name = scanner.nextLine();
        System.out.print("Enter board size: ");
        int boardSize = scanner.nextInt();

        Player player1 = new Player(player1Name, 'X');
        Player player2 = new Player(player2Name, 'O');

        Game game = new Game(player1, player2, boardSize);
        game.start();

        scanner.close();
    }
}

