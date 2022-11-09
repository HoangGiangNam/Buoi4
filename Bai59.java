package BTbuoi4;

public class Bai59 {
    public static void main(String[] args) {
        int[] mang = {2, 3, 5, -7, -7, 5, 8, -5};
        timTichLonNhat(mang);

    }

    static void timTichLonNhat(int[] mang) {
        int[] mangmoi = new int[2];
        int maximunProduct = 0;
        for (int i = 0; i < mang.length; i++) {
            for (int j = 1; j < mang.length; j++) {
                if (maximunProduct < mang[i] * mang[j] && mang[i] != mang[j]) {
                    maximunProduct = mang[i] * mang[j];
                    mangmoi[0] = mang[i];
                    mangmoi[1] = mang[j];
                }

            }
        }
        System.out.println(String.format("Pair is (%d,%d), Maximum Product:%d", mangmoi[0], mangmoi[1], maximunProduct));
    }
}
