package homeworks;
/*      Write an application, that will read one number from user (of type int)
        and check, if given number is "near" 100. A number is "near" 100 when
        difference between it and 100 is no bigger than 10.

        Your application should read one number (int) and print false or true on the screen,
        according to instructions above.*/

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = scanner.nextInt();

        if((number >= 90) && (number <= 110) ){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        //Method 2 boolean
        //System.out.println(Math.abs(100 - num) <= 10);
    }
}
