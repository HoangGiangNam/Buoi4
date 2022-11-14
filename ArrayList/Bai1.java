package BTbuoi4.ArrayList;

import java.util.ArrayList;

public class Bai1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Sunday");
        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesday");
        list.add("Thursday");
        list.add("Friday");
        list.add("Saturday");
        System.out.println("List:");
        for (String item : list
        ) {
            System.out.print(item + " ");

        }
    }
}
