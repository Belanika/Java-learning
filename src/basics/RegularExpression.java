package basics;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {

        //Example 1
        Pattern pattern = Pattern.compile("a+b");
        Matcher matcher = pattern.matcher("aaab");

        System.out.println(matcher.matches());
        System.out.println(matcher.find()); // finds a piece of string matching with the requirements

        //Example 2
        //Any 3 lowercase letters or any number 5-9
        System.out.println(Pattern.matches("[a-z5-9]{3}", "axo9"));

        //2 Uppercase letters, 2 Lowercase letters, 3 numbers
        System.out.println(Pattern.matches("[A-Z]{2}[a-z]{2}[0-9]{3}", "JKkl999"));

        //Latvian car registration plate AB-1234, AB-123, AB-12

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your car plate number");
        String plateNumber = scanner.nextLine();

        Pattern pattern1 = Pattern.compile("[A-Z]{2}-[0-9]{2,4}");
        Matcher matcher1 = pattern1.matcher(plateNumber);

        boolean validPlateNumber = matcher1.matches();

        if (validPlateNumber == true){
            System.out.println("Your plate number is valid");
        }else {
            System.out.println("Your plate number is not valid");
        }
    }
}
