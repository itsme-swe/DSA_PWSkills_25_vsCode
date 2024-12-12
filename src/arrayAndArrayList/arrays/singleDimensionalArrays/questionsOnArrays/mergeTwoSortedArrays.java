/*
💥 Merge two sorted arrays in one single array. --- Imp concept
*/

package arrayAndArrayList.arrays.singleDimensionalArrays.questionsOnArrays;

import java.sql.Array;

public class mergeTwoSortedArrays {

    public static void main(String[] args) {

         int[] arr1 = {2, 4, 6, 7};

         int [] arr2 = {3, 5, 8, 9, 10, 25, 35};


         int[] arr3 = new int[arr1.length + arr2.length];

         int i = 0;
         int j = 0;
         int k = 0;

         while (i < arr1.length && j < arr2.length) {

             if (arr1[i] < arr2[j]) {
                 arr3[k] = arr1[i];
                 i++;
             }
             else {
                 arr3[k] = arr2[j];
                 j++;
             }
             k++;
         }

         // Agar hamara i arr1 ki length kae barabar ho chuka hai toh phir hum bache huae arr2 kae elements ko arr3 mae insert kar denge
         if (i == arr1.length) {
             while (j < arr2.length) {
                 arr3[k] = arr2[j];
                 j++;
                 k++;
             }
         } else if (j == arr2.length) {
             while (i < arr1.length) {
                 arr3[k] = arr1[i];
                 i++;
                 k++;
             }
         }

        for (int ele : arr3) {
             System.out.print(ele + " ");
         }

    }
}

// o/p : 2 3 4 5 6 7 8 9 10 25 35
