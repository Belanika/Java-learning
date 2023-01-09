package homeworks;

import java.util.Scanner;

public class HW15 {
    public static void main(String[] args) {
        boolean yn = true;
        do {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Player1, Rock, paper or scissors?");
            String player1move = scanner1.nextLine().toLowerCase();

            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Player2, Rock, paper or scissors?");
            String player2move = scanner2.nextLine().toLowerCase();

            System.out.println(rockPaperScissors(player1move, player2move));

            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Wanna play again?(y/n)");
            String answer = scanner3.nextLine();

            switch (answer) {
                case "n":
                    yn = false;
                    break;
                case "y":
                    yn = true;
                    break;
                default:
                    break;
            }
        }
        while (yn);
    }

        public static String rockPaperScissors (String player1move, String player2move){
        String result = "Please check your choices";
        if ((player1move.equals("paper") && player2move.equals("rock")) || (player1move.equals("scissors") && player2move.equals("paper")) || (player1move.equals("rock") && player2move.equals("scissors"))) {
            result = "Player 1 wins!";
        }
        else if ((player1move.equals("rock") && player2move.equals("paper")) || (player1move.equals("paper") && player2move.equals("scissors")) || (player1move.equals("scissors") && player2move.equals("rock"))) {
            result = "Player 2 wins!";
        }
        else if (player1move.equals(player2move)) {
            result = "It's a tie";
        }
        return result;
    }
    }
