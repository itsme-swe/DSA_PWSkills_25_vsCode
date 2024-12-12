package arrayAndArrayList.arrayList.basicMethodsOfArrayList;

import java.util.Arrays;

public class copyOfMethodForDeepCopy {

    public static void main(String[] args) {

        int [] arr = {2, 4, 6, 8, 10};

        int[] arr1 = arr;

        arr1[0] = 12;

        System.out.print("Shallow Copy concept: ");
        for(int ele : arr1) {
            System.out.print(ele + " ");
        }

        /* Output: 12 4 6 8 10
        🔸 This is the concept of shallow copy. In 'shallow copy' the copy of new array is not created only the reference of original is passed to the
        new array, or we can say new name of an array created and point towards the old array only. If we change the value in a new array, the value will also be changed in
        an old array.
        */

        System.out.println();

        int [] brr = Arrays.copyOf(arr,arr.length);

        brr[0] = 30;

        System.out.print("Deep Copy: ");
        for (int ele : brr) {
            System.out.print(ele + " ");
        }

        // Output: Deep Copy: 30 4 6 8 10

        System.out.println();

        System.out.print("Original Array: ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        // Output: Original Array: 12 4 6 8 10

        /*
        * The difference b/w shallow copy and deep copy is in shallow copy ref. is passed and in deep copy the original copy of an array is created.
        * If we change value in shallow copy concept, the value gets changed in an original array also but in deep copy the value of the original array does not change.
        * */
    }
}
