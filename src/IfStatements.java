import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //IF
        System.out.println("Enter a grade");
        int grade = scanner.nextInt();

        //Print out "Good job" if grade is over 6
        if (grade > 6){
            System.out.println("Good job");
        }

        //Print out "You can do better!" if grade is less or equal to 4
        if (grade <= 4){
            System.out.println("You can do better!");
        }

        //ELSE
        // Print "You have passed the test" if grade is equal or greater than 4,
        // but if it's not, then print "You have failed the test"

        if (grade >= 4){
            System.out.println("You have passed the test");
        } else {
            System.out.println("You have failed the test");
        }

        //ELSE IF
        // 1-3 Very bad
        // 4-5 Okay
        // 6 Nice
        // 7-10 Very good

        if (grade < 4 && grade >= 1){
            System.out.println("Very bad");
        }else if (grade == 4 || grade ==5){
            System.out.println("Okay");
        }else if (grade == 6){
            System.out.println("Nice");
        }else {
            System.out.println("Very good");
        }
    }
}
