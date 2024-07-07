import java.util.*;

import Board.Board;

public class App {
    public static void main(String[] args) throws Exception {
        int players[] = new int[2];
        int player = 1;
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        Board board = new Board();

        while (players[player] < 100) {
            player = 1 - player;
            System.out.println("Player" + (player + 1) + " enter y to roll the die or n to exit...");
            String ch = sc.next();
            switch (ch) {
                case "y":
                    int roll = ((int) (Math.random() * 10) / 6) + 1;
                    int isSnakeOrLadder = board.getValue(players[player] + roll);
                    if (isSnakeOrLadder == -1) {
                        players[player] += roll;
                        System.out.println("Player" + (player + 1) + " position = " + players[player]);
                        System.out.println("______________________________________________________________");
                        System.out.println();
                    } else {
                        if (isSnakeOrLadder < players[player]) {
                            System.out.println("Oops! You were bit by a snake...");
                        } else {
                            System.out.println("Hurrey! You caught up with a ladder...");
                        }
                        players[player] = isSnakeOrLadder;
                        System.out.println("Player" + (player + 1) + " position = " + players[player]);
                        System.out.println("______________________________________________________________");
                        System.out.println();
                    }
                    break;
                case "n":
                    exit = true;
                    break;
                default:
                    System.out.println("Oops! You have entered a wrong choice.");
            }

            if (exit)
                break;
        }

        if (exit) {
            System.out.println("You are exited from the game.");
        } else
            System.out.println("Player" + (player + 1) + " won the match.");

        sc.close();
    }
}
