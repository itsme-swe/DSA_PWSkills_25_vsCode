/*
💥 Toggle all the characters of the string.(Replace small case with capital case and vice vera)

*/

package Strings.StringBuilder.QuestionBank;

public class toggleCharacters {

    public static void main(String[] args) {

        String s = "sKoDa sLAviA";

        System.out.println(s);

        StringBuilder sb = new StringBuilder(s);

        int n = sb.length();

        for (int i = 0; i < n; i++) {

            char ch = sb.charAt(i); // storing each character of string in ch

            int ascii = (int)ch;    // Then typecasting each char into int

            // Checking if each 'ch' is a capital letter then converting into a small letter. To make it small, add 32 into ascii
            if(ascii >= 65 && ascii <= 90) {
                ascii += 32;

            } else if (ascii >= 97 && ascii <= 122) {   // Same to convert from small to capital
                ascii -= 32;

            }
            // These are the common steps in both if and else if statement so we can bring them out to save some lines of our code.
            ch = (char)ascii;
            sb.setCharAt(i,ch);

        }
        System.out.println(sb);
    }
}
