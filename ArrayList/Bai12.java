package BTbuoi4.ArrayList;

import java.util.ArrayList;

public class Bai12 {
    public static void main(String[] args) {
        ArrayList<Integer> integers1 = new ArrayList<>();
        integers1.add(1);
        integers1.add(2);
        integers1.add(3);
        integers1.add(4);
        System.out.println("integers1: " + integers1);
        ArrayList<Integer> integers2 = new ArrayList<>();
        integers2.add(1);
        integers2.add(4);
        integers2.add(5);
        integers2.add(9);
        System.out.println("integers2: " + integers2);
        System.out.println(difference(integers1, integers2));
        System.out.println(uniqueValues(integers1, integers2));

    }

    public static ArrayList<Integer> difference(ArrayList<Integer> integers1, ArrayList<Integer> integers2) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int index = 0; index < integers1.size(); index++) {
            if (!integers2.contains(integers1.get(index))) {
                {
                    arrayList.add(integers1.get(index));
                }


            }
        }
        return arrayList;
    }

    public static ArrayList<Integer> uniqueValues(ArrayList<Integer> integers1, ArrayList<Integer> integers2) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int index = 0; index < integers1.size(); index++) {
            if (!integers2.contains(integers1.get(index))) {
                {
                    arrayList.add(integers1.get(index));
                }


            }
        }
        for (int index = 0; index < integers2.size(); index++) {
            if (!integers1.contains(integers2.get(index))) {
                {
                    arrayList.add(integers2.get(index));
                }


            }
        }
        return arrayList;
    }
}


