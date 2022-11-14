package BTbuoi4.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Bai2 {
    public static void main(String[] args) {
        String[] array={"Sunday","Monday","Tuesday","Thursday","Wednesday","Friday","Saturday"};
        ArrayList<String> arrayList=new ArrayList<>(Arrays.asList(array));
        System.out.println(arrayList);
    }
}
