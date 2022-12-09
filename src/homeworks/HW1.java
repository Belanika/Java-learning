package homeworks;

import java.util.Scanner;

//Ask user to enter name and year of birth
// Print out John 2000
// Your name is John and you are 22 years old

public class HW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Please enter your year of birth: ");
        int year = scanner.nextInt();
        int age = 2022 - year;

        System.out.println("Your name is " + name + " and you are " + age + " years old");

    }
}
