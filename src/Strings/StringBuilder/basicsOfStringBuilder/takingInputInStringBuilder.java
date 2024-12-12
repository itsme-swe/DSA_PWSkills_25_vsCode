package Strings.StringBuilder.basicsOfStringBuilder;

import java.util.Scanner;

public class takingInputInStringBuilder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the string inside the String Builder ");

        StringBuilder str = new StringBuilder(sc.nextLine());   // using String method only and inserting inside String Builder

        System.out.println(str);

    }
}
