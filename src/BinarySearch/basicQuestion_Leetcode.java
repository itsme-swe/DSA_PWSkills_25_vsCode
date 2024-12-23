/*
 * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

  You must write an algorithm with O(log n) runtime complexity.
 * 
 */

package BinarySearch;

public class basicQuestion_Leetcode {

  public static void main(String[] args) {

    int[] arr = { -1, 0, 3, 5, 9, 12 };

    int target = 11;

    int result = binarySearch(arr, target);

    System.out.print("The element present at index value: ");
    System.out.println(result);

  }

  public static int binarySearch(int[] arr, int target) {

    int n = arr.length;

    int low = 0;
    int high = n - 1;

    while (low <= high) {

      int mid = low + (high - low) / 2;

      if (arr[mid] == target)
        return mid;
      else if (arr[mid] > target)
        high = mid - 1;
      else
        low = mid + 1;

    }
    return -1;

  }

}
