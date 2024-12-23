package Sorting.insertionSorting;

public class insertionSortDemo1 {

  public static void main(String[] args) {

    int[] nums = { 10, -4, 20, 7, -6, 8, 2 };

    int n = nums.length;

    System.out.print("Unsorted Array: ");
    printArray(nums);

    // Insertion Sort
    for (int i = 1; i < n; i++) {
      // Moving towards left side aur yaha pae loop tbhi chalega jub tuk j 1 sae bada
      // hai ya barabar aur 'jth' value choti hai 'jth-1' value sae.
      for (int j = i; j >= 1 && nums[j] < nums[j - 1]; j--) {

        swapArrEle(nums, j, j - 1);

      }
    }

    System.out.print("Sorted Array: ");
    printArray(nums);
  }

  public static void printArray(int[] arr) {

    for (int ele : arr) {
      System.out.print(ele + " ");
    }
    System.out.println();

  }

  public static void swapArrEle(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;

  }
}
