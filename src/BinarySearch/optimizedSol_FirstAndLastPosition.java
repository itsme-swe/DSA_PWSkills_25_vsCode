/*
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
 * 
 * LeetCode: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/1486715720/
 */

package BinarySearch;

public class optimizedSol_FirstAndLastPosition {

  public static void main(String[] args) {

    int[] nums = { 5, 7, 7, 8, 8, 10 };

    int target = 8;

    int[] ans = searchRange(nums, target);

    printArray(ans);

  }

  public static void printArray(int[] arr) {

    for (int ele : arr) {
      System.out.print(ele + " ");
    }
    System.out.println();
  }

  public static int[] searchRange(int[] nums, int target) {

    int n = nums.length;

    int[] ans = new int[2];

    int low;
    int high;

    // Finding first position
    int fp = -1;
    low = 0;
    high = n - 1;
    while (low <= high) {

      int mid = low + (high - low) / 2;

      if (nums[mid] == target) {
        if (mid > 0 && nums[mid] == nums[mid - 1])
          high = mid - 1;
        else {
          fp = mid;
          break;
        }
      } else if (nums[mid] < target)
        low = mid + 1;
      else if (nums[mid] > target)
        high = mid - 1;

    }

    // Finding last position
    int lp = -1;
    low = 0;
    high = n - 1;
    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (nums[mid] == target) {
        if (mid + 1 < n && nums[mid] == nums[mid + 1])
          low = mid + 1;
        else {
          lp = mid;
          break;
        }
      } else if (nums[mid] < target)
        low = mid + 1;
      else if (nums[mid] > target)
        high = mid - 1;
    }
    ans[0] = fp;
    ans[1] = lp;

    return ans;

  }

}
