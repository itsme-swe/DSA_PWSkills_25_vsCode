package Strings.StringBuilder.basicsOfStringBuilder;

import java.util.Scanner;

public class setCharAtMethod {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the string: ");

        StringBuilder sb = new StringBuilder(sc.nextLine());

        System.out.println(sb); // o/p: Harsh

        sb.setCharAt(2,'a');

        System.out.println(sb.charAt(1));   // return the char present at given index value

        System.out.println(sb); // o/p: Haash
    }
}
