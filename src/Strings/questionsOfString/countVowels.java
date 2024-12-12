/*
💥 Count all the vowels in given string.
*/

package Strings.questionsOfString;

public class countVowels {

    public static void main(String[] args) {

        String animal = "Lion is king of jungle";

        int n = animal.length();

        int count = 0;

        for (int i = 0; i < n; i++) {

            char ch = animal.charAt(i);

            if(isVowel(ch) == true) count++;
        }

        System.out.printf("The total number of vowels in animal are %d", count);

    }

    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'A') return true;
        if (ch == 'e' || ch == 'E') return true;
        if (ch == 'i' || ch == 'I') return true;
        if (ch == 'o' || ch == 'O') return true;
        if (ch == 'u' || ch == 'U') return true;

        return false;
    }
}
