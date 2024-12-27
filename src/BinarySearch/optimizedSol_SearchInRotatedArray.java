/*
 * 
 * There is an integer array nums sorted in ascending order (with distinct values).
 * Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums
 * [+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
 * 
 * Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * LeetCode: https://leetcode.com/problems/search-in-rotated-sorted-array/description/
 * 
 */

package BinarySearch;

public class optimizedSol_SearchInRotatedArray {

  public static void main(String[] args) {

    int[] num = { 4, 5, 6, 7, 0, 1, 2 };

    int target = 7;

    int result = searchOptimizedSol(num, target);

    System.out.print(result);

  }

  public static int searchOptimizedSol(int[] nums, int target) {

    int n = nums.length;

    int lo = 0;
    int hi = n - 1;

    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;

      if (nums[mid] == target)
        return mid;
      else if (nums[mid] <= nums[hi]) {
        if (target >= nums[mid] && target < nums[hi])
          lo = mid + 1;
        else
          hi = mid - 1;
      } else {
        if (target >= nums[lo] && target < nums[mid])
          hi = mid - 1;
        else
          lo = mid + 1;
      }
    }
    return -1;
  }

}
