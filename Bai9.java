package BTbuoi4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        int[] mang = {1, 3, 45, 62, 4};
        int[] mangmoi = new int[mang.length + 1];
        int phanTuThem;
        int viTriThem;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mảng trước khi thêm");
        for (int index = 0; index < mang.length; index++) {
            System.out.println(mang[index] + " ");
        }
        System.out.println("Thêm phân tử:");
        phanTuThem = scanner.nextInt();
        System.out.println("Nhập vị trí cần thêm:");
        do {
            viTriThem = scanner.nextInt();

        } while (viTriThem < 0 && viTriThem > mangmoi.length);
        for (int index = 0; index < viTriThem; index++) {
            mangmoi[index] = mang[index];
        }
        for (int index = viTriThem; index < mang.length; index++) {
            mangmoi[viTriThem] = phanTuThem;
            mangmoi[index + 1] = mang[index];
        }
        System.out.println("Mảng trước sau thêm");
        for (int index = 0; index < mangmoi.length; index++) {
            System.out.println(mangmoi[index] + " ");
        }
    }
}
