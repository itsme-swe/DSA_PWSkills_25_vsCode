/*
 * First of all we dont't have any in-built sorting method for strings in java. So, if we need to sort strings in java 
 * we need to convert into char[] because array is having in-built sort method.
 */
package Strings.questionsOfString;

import java.util.Arrays;

public class sortingString {

  public static void main(String[] args) {

    String str = "harsh mehra";

    char[] ch = str.toCharArray(); // typecasted string to char[] array

    for (char ele : ch) {
      System.out.print(ele);
    }

    System.out.println();

    Arrays.sort(ch); // using in-built method of sort and passing ch[] as an argument

    for (char ele : ch) {
      System.out.print(ele);
    }
    System.out.println();

  }

}

/*
 * harsh mehra
 * 
 * aaehhhmrrs -- sorted string
 * 
 */