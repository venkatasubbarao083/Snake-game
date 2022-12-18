package com.board.oops;
import java.util.Scanner;
public class App {
    public static void main(String args[]) {
        Scanner players = new Scanner(System.in);
        System.out.println("Enter the player 1 name :");
        String player1 = players.nextLine();
        System.out.println("Enter the player 2 name :");
        String player2 = players.nextLine();
        Game game = new Game(player1, player2);

        while (!game.isOver){
            game.proceed();
        }
    }
}
