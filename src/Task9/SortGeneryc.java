package Task9;

import java.util.ArrayList;
import java.util.Collections;

public class SortGeneryc {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(55);
        arrayList.add(12);
        arrayList.add(8);
        arrayList.add(33);

        System.out.println("Before sorting:" + arrayList);

        Collections.sort(arrayList);

        System.out.println("After sorting:" + arrayList);

        }
    }
