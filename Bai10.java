package BTbuoi4;

import java.util.Arrays;

public class Bai10 {
    public static void main(String[] args) {
        int[] mang = {1, 3, 45, 62, 4};
        System.out.println(Arrays.stream(mang).max());
        System.out.println(Arrays.stream(mang).min());
    }

}
