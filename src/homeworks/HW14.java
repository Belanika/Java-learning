//package homeworks;
//
import java.util.Arrays;

import static java.util.Collections.min;

public class HW14 {
    public static void main(String[] args) {
        int[] my_array = {-56, -78, -3, -88, -90, -12, -176, -105};
        System.out.println("Original Array: " + Arrays.toString(my_array));
        max(my_array);
        min(my_array);
    }

    public static int max(int[] my_array) {
        int res = my_array[0];
        for (int i = 1; i <= my_array.length - 1; i++) {
            res = Math.max(res, my_array[i]);
        }
        System.out.println(res);
        return res;
    }

    public static int min(int[] my_array) {
        int res = my_array[0];
        for (int i = 1; i <= my_array.length - 1; i++) {
            res = Math.min(res, my_array[i]);
        }
        System.out.println(res);
        return res;
    }
}
