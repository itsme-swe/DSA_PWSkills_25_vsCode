package BinarySearch;

public class findLowerBound {

  public static void main(String[] args) {

    int[] arr = { 15, 25, 35, 40, 40, 65, 75, 85, 97, 105 };

    int x = 50;

    System.out.print("The lb index of target x is: ");
    int lowerBound = lowerBound(arr, x);

    System.out.println(lowerBound);

  }

  public static int lowerBound(int[] arr, int target) {

    int n = arr.length;

    int lb = n;

    int low = 0;
    int high = n - 1;

    while (low <= high) {

      int mid = low + (high - low) / 2;
      if (arr[mid] >= target) {
        lb = Math.min(lb, mid);
        high = mid - 1;
      } else {
        low = mid + 1;
      }

    }

    return lb;

  }
}
