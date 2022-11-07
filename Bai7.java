package BTbuoi4;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        int[] mang = {0, 4, 3, 2, 1};
        int[] mangmoi = {};
        Scanner scanner = new Scanner(System.in);
        int phanTu;
        System.out.println("Mảng:");
        for (int index = 0; index < mang.length; index++) {
            System.out.print(mang[index] + " ");
        }
        System.out.println("Nhập phần tử cần xóa");
        phanTu = scanner.nextInt();
        int viTriCanXoa = timViTriPhanTu(mang, phanTu);
        if (viTriCanXoa == -1) {
            System.out.println("Phần tử này không nằm trong mảng");
        } else {
            mangmoi = xoaPhanTuTrongMang(mang, viTriCanXoa);
        }
        System.out.println("Mảng sau khi xóa :");
        for (int index = 0; index < mangmoi.length; index++) {
            System.out.print(mangmoi[index] + " ");
        }

    }

    static int timViTriPhanTu(int[] mang, int phanTu) {
        int viTri = -1;
        for (int index = 0; index < mang.length; index++) {
            if (phanTu == mang[index]) {
                viTri = index;
            }
        }
        return viTri;
    }

    static int[] xoaPhanTuTrongMang(int[] mang, int viTri) {
        int[] mangmoi = new int[mang.length - 1];
        for (int index = 0; index < viTri; index++) {
            mangmoi[index] = mang[index];
        }
        for (int index = viTri + 1; index < mang.length; index++) {
            mangmoi[index - 1] = mang[index];
        }
        return mangmoi;
    }
}
