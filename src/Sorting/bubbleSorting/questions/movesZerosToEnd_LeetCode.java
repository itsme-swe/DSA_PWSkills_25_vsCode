/*
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * 
 * Note that you must do this in-place without making a copy of the array.
 * 
 * LeetCode - https://leetcode.com/problems/move-zeroes/description/
 */
package Sorting.bubbleSorting.questions;

public class movesZerosToEnd_LeetCode {

  public static void main(String[] args) {

    int[] nums = { 0, 1, 0, 3, 12 };

    System.out.print("Before: ");
    printArray(nums);

    System.out.println();

    moveZeros(nums);

    System.out.print("After: ");
    printArray(nums);

  }

  public static void printArray(int[] arr) {

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();

  }

  public static void moveZeros(int[] arr) {

    int n = arr.length;

    int numOfZeros = 0;

    // Array me jitne bhi zeros hain unhe count karte hain
    for (int ele : arr) {
      if (ele == 0)
        numOfZeros++;
    }

    // Outer loop utni baar chalega jitne zeros hain
    for (int i = 0; i < numOfZeros; i++) {

      // Inner loop ka kaam hai adjacent elements ko swap karna jab tak zero end tak
      // na chala jaye.
      for (int j = 0; j < n - 1 - i; j++) {

        // Agar current element zero hai to usko next element ke sath swap karte hain
        if (arr[j] == 0) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

  }

}

/*
 * Before: 0 1 0 3 12
 * 
 * After: 1 3 12 0 0
 * 
 */