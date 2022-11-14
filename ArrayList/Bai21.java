package BTbuoi4.ArrayList;

import java.util.ArrayList;

public class Bai21 {
    public static void main(String[] args) {
        ArrayList<Integer> mang = new ArrayList<>();
        mang.add(1);
        mang.add(3);
        mang.add(4);
        mang.add(5);
        System.out.println("Cac phan tu trong mang" + mang);
        // Chuyen tu arraylist thanh array
        Integer[] mangmoi = new Integer[mang.size()];
        mang.toArray(mangmoi);
        for (Integer item : mangmoi
        ) {
            System.out.print(item + ",");

        }
    }
}
