package Strings.methodsOfString;

import java.util.Scanner;

public class lengthMethod {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your birth city: ");

        String city = sc.nextLine();

        System.out.println(city.length());  // length() method return the length of String
    }
}
