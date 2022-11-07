package BTbuoi4;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        int[] mang = {0, 4, 3, 2, 1};
        int phanTu;
        int viTri = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập phần tử cần tìm:");
        phanTu = scanner.nextInt();
        for (int index = 0; index < mang.length; index++) {
            if (phanTu == mang[index]) {
                viTri = index;
            }

        }
        if (viTri == -1) {
            System.out.println("Không có phần tử này trong mảng");
        } else {
            System.out.println("Phần tử này có chỉ số: " + viTri);

        }
    }
}
