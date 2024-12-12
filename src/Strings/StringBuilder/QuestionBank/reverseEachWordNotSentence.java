package Strings.StringBuilder.QuestionBank;

import java.util.Scanner;

public class reverseEachWordNotSentence {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your string");

            StringBuilder sb = new StringBuilder(sc.nextLine());

            reverse(sb, 0, sb.length() - 1);

            System.out.println(sb);
        }

    }

    public static void reverse(StringBuilder sb, int i, int j) {

        while (i <= j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
    }

}
