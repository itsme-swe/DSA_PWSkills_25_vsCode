/*
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * 
 * Leetcode 242 - https://leetcode.com/problems/valid-anagram/description/
 */

package Strings.questionsOfString;

import java.util.Arrays;

public class validAnagram {

  public static void main(String[] args) {

    String s = "rat";

    String t = "cat";

    System.out.println(isAnagram(s, t));

  }

  public static boolean isAnagram(String s, String t) {

    // To be an anagram length of both the strings to be same
    if (s.length() != t.length())
      return false;

    // typecasting string into char[] array
    char[] a = s.toCharArray();
    char[] b = t.toCharArray();

    Arrays.sort(a);
    Arrays.sort(b);

    for (int i = 0; i < a.length; i++) {
      // checking if each char of array a is not equal to each char of array b
      if (a[i] != b[i])
        return false;
    }
    return true;

  }

}

// o/p: false
