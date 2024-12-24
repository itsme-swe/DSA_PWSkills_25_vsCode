/*
 * Given a non-negative longeger x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
 * 
 * LeetCode: https://leetcode.com/problems/sqrtx/description/
 */
package BinarySearch;

public class squareRoot_x {

  public static void main(String[] args) {

    int x = 20;

    int result = mySqrt(x);

    System.out.println(result);
  }

  public static int mySqrt(int x) {

    long low = 0;
    long high = x;

    while (low <= high) {

      long mid = (high + low) / 2;

      if (mid * mid == x)
        return (int) mid;
      else if (mid * mid > x)
        high = mid - 1;
      else if (mid * mid < x)
        low = mid + 1;

    }
    return (int) high;
  }
}
