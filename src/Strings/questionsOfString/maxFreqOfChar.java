/*
 * Given a string consisting of lowercase letters alphabets. Print the character which is occuring most number of times.
 * 
 */
package Strings.questionsOfString;

public class maxFreqOfChar {

  public static void main(String[] args) {

    String str = "aaaabbccdddaaeeepp";

    int[] freq = new int[26];

    for (int i = 0; i < str.length(); i++) {

      char ch = str.charAt(i); // storing each char inside ch
      int idx = (int) ch - 97; // typecasting char into int for ASCII value of char
      freq[idx]++; // right now all the values inside freq[] is 0

    }

    // Here we are finding max freq i our freq array
    int maxFreq = -1;

    for (int i = 0; i < freq.length; i++) {
      maxFreq = Math.max(maxFreq, freq[i]);
    }

    for (int i = 0; i < freq.length; i++) {

      if (freq[i] == maxFreq) {

        char ch = (char) (i + 97);

        System.out.println(ch + " ");

      }

    }
  }

}
