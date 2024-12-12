/*
💥 Rotate Array (LeetCode: 189)

Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Link: https://leetcode.com/problems/rotate-array/description/?envType=problem-list-v2&envId=r7ox5ilh

*/
package arrayAndArrayList.arrays.singleDimensionalArrays.questionsOnArrays;

public class rotateArrayBySteps {

    public static void main(String[] args) {

        int [] arr = { 2, 4, 6, 8, 10 };

        int k = 3;

        int n = arr.length;

        k = k % n;

       // Reverse the array in parts and then the whole array
        reverse(arr, 0, n-k-1); // Reverse the first part
        reverse(arr, n-k, n-1); // Reverse the second part
        reverse(arr, 0, n-1);   // Reverse the whole array

        for(int ele:arr) {
            System.out.print(ele + " ");
        }

    }

    public static void reverse (int [] nums, int i, int j) {

        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public static void swap(int[] array, int i, int j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
    }
}


/*
☘ Approach -
1️⃣ Phele hum given value of k ko mod (%) karenge 'n' kae sath ho hai length of an array.
2️ Phir hum array ko 2 parts mae divide karenge. Phela hoga indexVal 0 sae n-k-1 indexVal tuk. Aur dusra hoga n-k indexVal sae n-1 indexVal tuk.
⃣3️⃣ Phir hum dono array ko alag alag reverse karenge uskae baad joh final array ayega usko reverse kar daenge
* */
