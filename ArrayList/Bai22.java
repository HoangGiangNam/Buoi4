package BTbuoi4.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Bai22 {
    public static void main(String[] args) {
        String[] array = { "Nam", "Giang"};
        System.out.println("Phan tu trong array:" + Arrays.toString(array));
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(array));
        System.out.println("Phan tu trong arraylist:" + arrayList);
    }
}
