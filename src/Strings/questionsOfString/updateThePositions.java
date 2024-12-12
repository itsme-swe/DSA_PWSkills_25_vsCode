/*
Update all the even positions in the string to character 'a'. Consider 0-based indexing
*/

package Strings.questionsOfString;

public class updateThePositions {

    public static void main(String[] args) {

        String carName = "Slavia";

        String str = "";    // Empty string

        for (int i = 0; i < carName.length(); i++) {
            if(i % 2 == 0) str += 'a';
            else str += carName.charAt(i);
        }

        System.out.println(str);    // o/p: alavaa


    }

}
