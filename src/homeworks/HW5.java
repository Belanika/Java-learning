package homeworks;

/*Alex is an owner of grocery store. Among many products he sells,
he's mostly famous for his hand-made jam, that is being
sold in jars of 1kg or 7kg. Alex sells only full jars
(i.e. it's only possible to buy the whole jar of 1kg, or 7kg).

Will is asked by his wife Jane to buy some amount of Alex's jam.
Will forgot to take his bag, thus he can take home no more than six jars of jam
(three jars in each of his two hands). Jane is very serious about the
shopping list - if she asked for specific amount of jam, she expects exactly this
amount, no more, no less.

Write an application that will check if Will is able to take home the
amount of jam specified by Jane. Amount of jam should be read from user
(positive int value). You can assume that there's always enough jam in Alex's shop.
Your application should print true or false.*/

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much jam does Jane need?");
        int jam = scanner.nextInt();
        int x = 0;
        int y = 0;

        while((7 * x < jam) && x < 6){
            x++;
        }
        if (jam % 7 * x != 0){
           while(y < 6 && y < (jam % 7 * x)){
               y++;
           }
        }

        if(jam > 0 && (x != 0 || y != 0)){
           if(x + y <= 6){
               System.out.println("true");
           }
           else
               System.out.println("false");
        }

        //Option 2
        System.out.println(jam / 7 + jam % 7 < 6);

    }
}
