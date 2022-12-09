package homeworks;
/*     Write an application, that will read two numbers from user
       (of type int) and will print true, if both numbers are the
       same sign (both are positive, or both are negative), or false
       otherwise.

       If at least one of given numbers is equal to 0, your application
       should print false.*/

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input number 1: ");
        int num1 = scanner.nextInt();

        System.out.println("Please input number 2: ");
        int num2 = scanner.nextInt();

        if ((num1 > 0 && num2 > 0) || (num1 < 0 && num2 < 0)) {
            System.out.println("True");
        } else {
            System.out.println("False");
            }
        }
}
