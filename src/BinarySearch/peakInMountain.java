/*
 *You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease. 
 Return the index of the peak element.

Your task is to solve it in O(log(n)) time complexity.

LeetCode: https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

 */

package BinarySearch;

public class peakInMountain {

  public static void main(String[] args) {

    int[] arr = { 10, 20, 30, 40, 50, 60, 50, 30, 20, 10 };

    int peak = peakIndexInMountainArray(arr);

    System.out.println(peak);

  }

  public static void printArr(int[] array) {
    for (int ele : array) {
      System.out.print(ele + " ");
    }
    System.out.println();
  }

  public static int peakIndexInMountainArray(int[] arr) {
    int n = arr.length;

    int low = 1;
    int high = n - 2;

    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
        return mid;
      else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1])
        low = mid + 1;
      else if (arr[mid] > arr[mid + 1] && arr[mid] < arr[mid - 1])
        high = mid - 1;

    }

    return -1;

  }
}
