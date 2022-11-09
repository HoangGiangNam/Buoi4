package BTbuoi4;


public class Bai27 {
    public static void main(String[] args) {
        int[] mang = {1, 23, 42, 24, 2};
        int soChan = 0;
        int soLe = 0;
        if (mang.length > 0) {
            for (int index = 0; index < mang.length; index++) {
                if (mang[index] % 2 == 0) {
                    soChan++;
                } else {
                    soLe++;
                }

            }
            System.out.println("Số lượng số chẵn là " + soChan);
            System.out.println("Số lượng số chẵn là " + soLe);
        }

    }
}
