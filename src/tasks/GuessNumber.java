package tasks;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        int rand, guess, max;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter max random enter range");
        max = scanner.nextInt();

        rand = (int) (Math.random() * (max + 1));
        //System.out.println("Generated random value: " + rand);

        do{
            System.out.println("Guess the number");
            guess = scanner.nextInt();
            if (guess > rand){
                System.out.println("Try smaller");
            } else if(guess < rand){
                System.out.println("Try bigger");
            }
        }while(guess != rand);

        System.out.println("You guessed the number!");
    }
}
