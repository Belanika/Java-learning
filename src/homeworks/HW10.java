package homeworks;

import java.util.Arrays;

public class HW10 {
    public static void main(String[] args) {
        int[] Numbers = {1111, 2222, 3333, 4444, 5555, 6666, 7777};
        System.out.println(Arrays.toString(Numbers));

        for (int i = 0; i <= (Numbers.length / 2); i++) {
            int temp = Numbers[i];
            Numbers[i] = Numbers[(Numbers.length - i - 1)];
            Numbers[Numbers.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(Numbers));
    }
}
