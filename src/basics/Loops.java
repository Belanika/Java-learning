package basics;

public class Loops {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){
            System.out.println("Hello World!");
        }

        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }

        int i = 1;
        while (i <= 10){
            System.out.println("This is while loop");
            i++;
        }

        i = 1;
        do{
            System.out.println("This is do while loop");
            i++;
        }while(i <= 10);
    }
}
