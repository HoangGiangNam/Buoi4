package BTbuoi4;

public class Bai11 {
    public static void main(String[] args) {
        int[] mang = {1, 3, 45, 62, 4};
        int[] mangmoi=daoNguocMang(mang);
        for (int index = 0; index < mangmoi.length; index++) {
            System.out.println(mangmoi[index] + " ");
        }



    }
    static int [] daoNguocMang(int[] mang){
        int index=0;
        int [] mangmoi=new int[mang.length];
        for (int i=mang.length-1;i>=0;i--){
            mangmoi[index]=mang[i];
            index++;
        }
        return mangmoi;

    }
}
