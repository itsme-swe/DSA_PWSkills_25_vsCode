package BinarySearch;

public class findUpperBound {

  public static void main(String[] args) {

    int[] arr = { 15, 25, 35, 40, 40, 65, 75, 85, 97, 105 };

    int x = 40;

    System.out.print("The ub index of target x is: ");
    int upperBound = upperBound(arr, x);

    System.out.println(upperBound);

  }

  public static int upperBound(int[] arr, int target) {

    int n = arr.length;

    int ub = n;

    int low = 0;
    int high = n - 1;

    while (low <= high) {

      int mid = low + (high - low) / 2;
      if (arr[mid] > target) {
        ub = Math.min(ub, mid);
        high = mid - 1;
      } else {
        low = mid + 1;
      }

    }

    return ub;
  }

}
