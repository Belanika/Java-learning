package homeworks;

import java.util.Scanner;

public class HW2 {
    //Using scanner read speed in mp/h
    // Calculate and output in km/h
    // Example with input 122.7 mp/h
    // Output --> 122.7 mp.h in km/h would be equal to 197.46651
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the speed in mp/h: ");

        double speed = scanner.nextDouble();

        System.out.println(speed + " mp/h in km/h would be equal to " + (speed * 1.60934));

    }
}
