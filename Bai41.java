package BTbuoi4;

import java.util.Arrays;

public class Bai41 {
    public static void main(String[] args) {
        int[] mang = {1, 23, 4, 35, 35, 53};
        Arrays.sort(mang);
        int soNHoThuNhat = mang[0];
        int soNHoThuHai = mang[1];
        System.out.println("Số nhỏ nhất: " + soNHoThuNhat);
        System.out.println("Số nhỏ thứ hai: " + soNHoThuHai);

    }
}

