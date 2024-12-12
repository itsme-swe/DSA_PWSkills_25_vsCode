package arrayAndArrayList.arrayList.basicMethodsOfArrayList;

import java.util.ArrayList;
import java.util.List;

public class creatingArrayList {

    public static void main(String[] args) {

        List<Integer> lt = new ArrayList<>();

        //1️⃣ add(): method used to add elements in ArrayList.
        lt.add(0,10);
        lt.add(1,2);
        lt.add(2,20);
        lt.add(3,15);

        //2️⃣ get() method: is used to print the individual element of an ArrayList, and in an array we use length method here we use size() method.
        for (int i = 0; i < lt.size(); i++) {
            System.out.print(lt.get(i) + " ");
        }

        // Output: 10 2 20 15

        System.out.println();
        //3️⃣ set() method: modifying element at given indexValue
        lt.set(2,50);
        System.out.println(lt); // Output: [10, 2, 50, 15]
    }
}
