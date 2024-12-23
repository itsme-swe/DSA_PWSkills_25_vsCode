package BinarySearch;

public class binarySearchDemo_1 {

  public static void main(String[] args) {

    int[] arr = { 15, 25, 35, 40, 65, 75, 85, 105 };

    int target = 85;

    int n = arr.length;

    int low = 0;
    int high = n - 1;

    boolean flag = false;

    while (low <= high) {
      int mid = (low + high) / 2;

      if (arr[mid] == target) {
        flag = true;
        break;
      } else if (arr[mid] < target)
        low = mid + 1;
      else if (arr[mid] > target)
        high = mid - 1;

    }

    if (flag)
      System.out.println("Target Found");
    else
      System.out.println("Target not found");

  }
}
