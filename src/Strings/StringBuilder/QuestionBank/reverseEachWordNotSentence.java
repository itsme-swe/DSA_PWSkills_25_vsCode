package Strings.StringBuilder.QuestionBank;

import java.util.Scanner;

public class reverseEachWordNotSentence {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your string");

            StringBuilder sb = new StringBuilder(sc.nextLine());

            int n = sb.length();

            /*
             * Using 2 pointer approach but in this ques we'll be starting both the pointers
             * from one place
             */

            int i = 0, j = 0;

            while (j < n) {
                if (sb.charAt(j) != ' ') // yaha pae jth element agar space pae nhi aya toh aage bado
                    j++;
                else { // aur agr space pae aa gaya hai to reverse karo ith element ko aur space sae 1
                       // phele element ko
                    reverse(sb, i, j - 1);
                    i = j + 1; // then ith element ko jth element sae aage lae jao
                    j = i; // aur phir jth element ko bhi vaha liyao
                }
            }

            reverse(sb, i, j - 1); // this is for only reversing last word of sentence

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

/*
 * Hello Mahindra Roxx
 * 
 * olleH ardnihaM xxoR
 * 
 */
