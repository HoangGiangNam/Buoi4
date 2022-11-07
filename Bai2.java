package BTbuoi4;

import java.util.Arrays;

public class Bai2 {
    public static void main(String[] args) {
        int tong = 0;
        int[] array = {1, 2, 5, 6, 8, 0};
        for (int index = 0; index < array.length; index++) {
            tong = tong + array[index];
        }
        System.out.println("Tổng mảng la:"+tong);

    }
}
