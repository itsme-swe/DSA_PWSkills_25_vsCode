package arrayAndArrayList.arrayList.MultiDimensionalArrayList;

import java.util.ArrayList;
import java.util.List;

public class multiDimensionalArrayList {

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();

        a.add(20); a.add(10);a.add(40);a.add(30);

        List<Integer> b = new ArrayList<>();

        b.add(25); b.add(35);

        List<Integer> c = new ArrayList<>();

        List<Integer> d = new ArrayList<>();

        d.add(15);

        //1️⃣ Adding 1D ArrayList inside 2D ArrayList
        List<List<Integer>> arr = new ArrayList<>();

        arr.add(a);
        arr.add(b);
        arr.add(c);
        arr.add(d);

        //2️⃣ Now printing 2D ArrayList
        for (int i = 0; i < arr.size(); i++) {
            List<Integer> x = arr.get(i);
            for (int j = 0; j < x.size(); j++) {
                System.out.print(x.get(j) + " ");
            }
            System.out.println();
        }
    }
}
