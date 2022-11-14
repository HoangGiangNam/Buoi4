package BTbuoi4.ArrayList;

import java.util.ArrayList;

public class Bai8 {
    public static void main(String[] args) {
        String string = "Hoang";
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hoang");
        arrayList.add("Han Ha");
        arrayList.add("Hoang");
        arrayList.add("Thiên Hạ");
        System.out.println(string + " trong mảng ở phần tử thứ:" + findValue(arrayList, string));
        System.out.println("Mảng :" + arrayList);
        System.out.println("Mảng sau khi xóa các phần tủ trùng lặp:");
        System.out.println(removeDuplicates(arrayList));
        ArrayList<String> values1 = new ArrayList<>();
        values1.add("1");
        values1.add("3");
        values1.add("4");
        ArrayList<String> values2 = new ArrayList<>();
        values2.add("5");
        values2.add("3");
        values2.addAll(values1);
        System.out.println("Mảng values1:" + values1);
        System.out.println("Mảng values2:" + values2);
        System.out.println("Giá trị chung của hai mảng là:" + commomValues(values1, values2));
        System.out.println("Mảng kết hợp của hai mảng là:" + union(values1, values2));

    }

    // Bai 8
    public static int findValue(ArrayList<String> arrayList, String string) {
        int find = -1;
        for (int index = 0; index < arrayList.size(); index++) {
            if (string.equals(arrayList.get(index))) {
                find = index + 1;

            }
        }

        return find;
    }

    // Bai 9
    public static ArrayList<String> removeDuplicates(ArrayList<String> values) {
        ArrayList<String> arrayList = new ArrayList<>();

        for (int index = 0; index < values.size(); index++) {
            if (!arrayList.contains(values.get(index))) {
                arrayList.add(values.get(index));
            }


        }
        return arrayList;
    }

    // Bai 10
    public static ArrayList<String> commomValues(ArrayList<String> values1, ArrayList<String> values2) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String item : values1
        ) {
            if (values2.contains(item)) {
                arrayList.add(item);
            }

        }
        return arrayList;
    }

    // Bai 11
    public static ArrayList<String> union(ArrayList<String> values1, ArrayList<String> values2) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(values1);
        arrayList.addAll(values2);
        return removeDuplicates(arrayList);
    }
}
