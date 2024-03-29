package tasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PrintOutNumbers {
    public static void main(String[] args) {

        //Write an application that asks for user an integer value (it can be positive or negative)
        // You should print out all numbers starting from the one user entered till 0 including
        // Example:
        // Input : 5 Output: 5 4 3 2 1 0
        // Input : -8 Output: -8 -7 -6 -5 -4 -3 -2 -1 0

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number");
        int num = scanner.nextInt();

        if (num >= 0){
            for (int i = num; i >= 0; i--)
            System.out.print(i + " ");
        } else {
            for(int i = num; i <= 0; i++)
            System.out.print(i + " ");
        }
    }

}
