/*
 *Given an array of characters chars, compress it using the following algorithm:

  Begin with an empty string s. For each group of consecutive repeating characters in chars:

  If the group's length is 1, append the character to s.
  Otherwise, append the character followed by the group's length.
  The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.

  After you are done modifying the input array, return the new length of the array.

  You must write an algorithm that uses only constant extra space.

  Leetcode 443 - https://leetcode.com/problems/string-compression/description/
 * 
 */

package Strings.questionsOfString;

public class stringCompression_LeetCode {

  public static void main(String[] args) {

    char[] chars = { 'a', 'a', 'b', 'b', 'c', 'c', 'c', 'e', 'e', 'e', 'e', 'e' };

    String ans = "";

    int i = 0;
    int j = 0;

    while (j < chars.length) {

      if (chars[j] == chars[i])
        j++;

      else {
        // yaha pae phele humnae 'ans' empty string mae character add kiya hai aur aub
        // hum '+' operator sae length add karenge
        ans += chars[i];
        int len = j - i; // finding particular char length

        // condition to check if length of any char is more than 1 then only we add
        // length after the char
        if (len > 1)
          ans += len;
        i = j;
      }
    }
    ans += chars[i];
    int len = j - i;
    if (len > 1)
      ans += len;
    System.out.println(ans);

  }

}
