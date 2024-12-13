package Sorting.basicCommonSorting_Ques;

public class checkArraySortedOrNot {

  public static void main(String[] args) {

    int[] arr = { 1, 3, 6, 8, 15, 18 };

    int n = arr.length;

    boolean isSorted = true; // Assume the array is sorted initially

    // Loop through the array to compare adjacent elements
    // Only loop till the second last element to avoid error
    for (int i = 0; i < n - 1; i++) {

      if (arr[i] > arr[i + 1]) { // Check if current element is greater than the next
        isSorted = false;
        break;
      }
    }
    if (isSorted)
      System.out.println("Sorted Order");
    else
      System.out.println("Unsorted");
  }

}
