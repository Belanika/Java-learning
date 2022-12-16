package homeworks;

import java.util.Scanner;

public class HW13 {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter any year");
        year = scanner.nextInt();

        determinLeapYear(year);
    }

//    public static void determinLeapYear(int year) {
//        if (year < 0){
//            System.out.println("Invalid input");
//        }
//        else if (year > 2100){
//            System.out.println("You are looking too far to the future");
//        }
//        else{
//            if (year % 400 == 0){
//                System.out.println("Leap year");
//            }
//            else if (year % 4 == 0 && year % 100 != 0) {
//                System.out.println("Leap year");
//            }
//            else {
//                System.out.println("Not leap year");
//            }
//        }

    public static String determinLeapYear(int year) {
        String str = " ";
        if (year < 0){
            str = "Invalid input";
        }
        else if (year > 2100){
            str = "You are looking too far to the future";
        }
        else{
            if (year % 400 == 0){
                str = " is a leap year";
            }
            else if (year % 4 == 0 && year % 100 != 0) {
                str = " is a leap year";
            }
            else {
                str = " is not a leap year";
            }
        }
        System.out.println(year + str);
        return str;
    }
}
