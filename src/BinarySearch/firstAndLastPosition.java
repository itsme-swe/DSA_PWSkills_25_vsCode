/*
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
 * 
 */

package BinarySearch;

public class firstAndLastPosition {

  public static void main(String[] args) {

    int[] nums = { 5, 7, 7, 8, 8, 10 };

    int target = 8;

    int ans[] = searchRange(nums, target);

    printArray(ans);

  }

  public static int[] searchRange(int[] arr, int target) {

    int[] ans = { -1, -1 };

    int n = arr.length;

    int low = 0;
    int high = n - 1;

    boolean flag = false; // It means value is not present

    // Normal binary search to check target value is present or not in an array
    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (arr[mid] == target) {
        flag = true;
        break;
      } else if (arr[mid] < target)
        low = mid + 1;
      else if (arr[mid] > target)
        high = mid - 1;
    }

    if (!flag)
      return ans;

    low = 0;
    high = n - 1;
    int lb = n;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (arr[mid] >= target) {
        lb = Math.min(lb, mid);
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    ans[0] = lb; // if we found lower bound so insert at first index of an ans[]

    low = 0;
    high = n - 1;
    int ub = n;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (arr[mid] > target) {
        ub = Math.min(ub, mid);
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }

    ans[1] = ub - 1;

    return ans;

  }

  public static void printArray(int[] arr) {

    for (int ele : arr) {
      System.out.print(ele + " ");
    }
    System.out.println();
  }

}
