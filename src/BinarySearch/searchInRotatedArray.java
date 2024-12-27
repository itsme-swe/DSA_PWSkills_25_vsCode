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
 * 🔸 This is not the optimized solution to solve this problem
 * 
 */
package BinarySearch;

public class searchInRotatedArray {

  public static void main(String[] args) {

    int[] num = { 4, 5, 6, 7, 0, 1, 2 };

    int target = 0;

    int pivot = search(num, target);

    System.out.println(pivot);

  }

  public static int search(int[] nums, int target) {

    int n = nums.length;

    if (n <= 2) {
      for (int i = 0; i < n; i++) {
        if (nums[i] == target)
          return i;
      }
      return -1;
    }

    int lo = 1;
    int hi = n - 2;

    int pivot = -1;

    while (lo <= hi) {

      int mid = lo + (hi - lo) / 2;

      if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
        pivot = mid;
        break;
      } else if (nums[mid] < nums[mid - 1] && nums[mid] < nums[mid + 1]) {
        pivot = mid - 1;
        break;
      } else if (nums[mid] > nums[mid - 1] && nums[mid] < nums[mid + 1]) {
        if (nums[mid] > nums[n - 1])
          lo = mid + 1;
        else
          hi = mid - 1;
      }
    }

    if (pivot == -1) {
      return binarySearch(nums, 0, n - 1, target);
    }

    int left = binarySearch(nums, 0, pivot, target);
    if (left != -1)
      return left;

    int right = binarySearch(nums, pivot + 1, n - 1, target);
    return right;

  }

  public static int binarySearch(int[] arr, int lo, int hi, int target) {

    while (lo <= hi) {

      int mid = lo + (hi - lo) / 2;
      if (arr[mid] == target)
        return mid;
      else if (arr[mid] > target)
        hi = mid - 1;
      else
        lo = mid + 1;

    }
    return -1;
  }

}
