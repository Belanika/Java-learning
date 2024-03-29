package basics;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your name");
//
//        String name = scanner.nextLine().toUpperCase().trim(); //trim - to get rid of spaces before and after text
//
//        System.out.println("Your name is " + name);
//
//        if (name.equals("BOB")){
//            System.out.println("Your name is Bob");
//        } else {
//            System.out.println("You are not Bob");
//        }

        String text1 = "This is ";
        String text2 = "new text";

        String result = text1.concat(text2);
        System.out.println(result);
        System.out.println("There are " + result.length() + " characters");

        System.out.println(result.indexOf("is")); //search of the particular part of the string

        String greetings = "This is holiday time. \nHave a nice holiday";
        System.out.println(greetings.replaceAll("holiday", "Christmas")); //replacing some particular parts of the text
        System.out.println(greetings.replaceFirst("holiday", "Christmas"));

        System.out.println(result.charAt(3)); //Character at a particular place of the string

        String introduction = "My name is Bob and I'm 15";
        System.out.println(introduction.substring(3)); //specific index in the array from which the string should be printed
        System.out.println(introduction.substring(3,7)); //from which to which character to print the string

        String bobsAge = introduction.substring(introduction.length()-2);
        System.out.println("Bob is " + bobsAge + " years old");

        //Wrapper class
        int bobsAgeAsInteger = Integer.parseInt(bobsAge); // conversion str to int
        System.out.println(bobsAgeAsInteger);

        if (bobsAgeAsInteger >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Child");
        }

        //conversion str to other data types
        String intStrValue = "1";
        String floatStrValue = "2.0";
        String doubleStrValue = "2.3434343434";
        String booleanStrValue = "true";
        String longStrValue = "100000000000000";

        int intValue = Integer.parseInt(intStrValue);
        double doubleValue = Double.parseDouble(doubleStrValue);
        float floatValue = Float.parseFloat(floatStrValue);
        boolean booleanValue = Boolean.parseBoolean(booleanStrValue);
        long longValue = Long.parseLong(longStrValue);
    }
}
