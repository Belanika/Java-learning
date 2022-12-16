package tasks;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = scanner.nextInt();

        if (year < 0){
            System.out.println("Invalid input");
        }
        else if (year > 2100){
            System.out.println("You are looking too far to the future");
        }
        else{
            if (year % 400 == 0){
                System.out.println("Leap year");
            }
            else if (year % 4 == 0 && year % 100 != 0) {
                System.out.println("Leap year");
            }
            else {
                System.out.println("Not leap year");
            }
        }
    }
}
